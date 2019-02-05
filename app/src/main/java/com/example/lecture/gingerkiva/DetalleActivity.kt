package com.example.lecture.gingerkiva

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView

import kotlinx.android.synthetic.main.activity_detalle.*

class DetalleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        val nombre = intent.getStringExtra("name");
        val actividad = intent.getStringExtra("activity")
        val sector = intent.getStringExtra("sector")

        val label = findViewById<TextView>(R.id.detalleLabel)

        label.text = "Nombre: "+ nombre +"\nActividad: "+ actividad+"\nSector: "+ sector

    }

}
