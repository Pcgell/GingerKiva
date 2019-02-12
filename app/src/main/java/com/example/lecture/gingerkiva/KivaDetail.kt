package com.example.lecture.gingerkiva

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.view.View
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.example.lecture.gingerkiva.models.LoanResponse
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_kiva_detail.*
import org.json.JSONObject
import java.util.logging.Level
import java.util.logging.LogRecord
import java.util.logging.Logger

class KivaDetail : AppCompatActivity() {

    lateinit var loanObject: LoanResponse

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

                    val gson = Gson()

                    loanObject = gson?.fromJson(response,LoanResponse::class.java)

                    myLabel.text = loanObject.loans!![0].name

                    //Logger.getAnonymousLogger().log(Level.INFO,response)


                },
                Response.ErrorListener {
                    Logger.getAnonymousLogger().log(Level.SEVERE, it.localizedMessage)
                })

// Add the request to the RequestQueue.
        queue.add(stringRequest)

    }

    fun onButtonClick(view: View) {
        val intent = Intent(this, DetalleActivity::class.java)

        intent.putExtra("name", loanObject.loans!![0].name)
        intent.putExtra("activity", loanObject.loans!![0].activity)
        intent.putExtra("sector", loanObject.loans!![0].sector)

        startActivityForResult(intent, 33)

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if(requestCode == 33){
            if(resultCode == Activity.RESULT_OK){
                var opcion = data?.getStringExtra("resultado")
                myLabel.text = opcion
            }else{
                myLabel.text = loanObject.loans!![0].name
            }
        }
    }


}
