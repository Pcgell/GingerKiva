package com.example.lecture.gingerkiva

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import kotlinx.android.synthetic.main.activity_kiva_detail.*
import org.json.JSONObject
import java.util.logging.Level
import java.util.logging.LogRecord
import java.util.logging.Logger

class KivaDetail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kiva_detail)
        val vs = VolleySingleton.getInstance(this)


// Instantiate the RequestQueue.
        val queue = vs.requestQueue
        val url = "https://api.kivaws.org/v1/loans/newest.json"

// Request a string response from the provided URL.
        val stringRequest = StringRequest(Request.Method.GET, url,
                Response.Listener<String> { response ->

                    val jsonResponse =  JSONObject(response)

                    val loans = jsonResponse.getJSONArray("loans")

                    val loan = loans.getJSONObject(0);

                    var lable = loan.getString("name")

                    lable += "\n "+loan.getString("status")

                    lable += "\n "+loan.getString("activity")

                    lable += "\n "+ loan.getString("sector")

                    myLabel.text = lable

                    Logger.getAnonymousLogger().log(Level.INFO,response)


                },
                Response.ErrorListener {
                    Logger.getAnonymousLogger().log(Level.SEVERE, it.localizedMessage)
                })

// Add the request to the RequestQueue.
        queue.add(stringRequest)

    }
}
