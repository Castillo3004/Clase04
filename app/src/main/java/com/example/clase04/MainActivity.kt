package com.example.clase04

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn2.setOnClickListener{
            val saltar: Intent = Intent(this, Ventana2::class.java)
            startActivity(saltar)
        }

        btn3.setOnClickListener{
            val saltar2: Intent = Intent(this, VentanaFecha::class.java)
            startActivity(saltar2)
        }

        btn1.setOnClickListener{
            Toast.makeText(applicationContext, "Este es un mensje", Toast.LENGTH_SHORT).show()
        }
    }
}