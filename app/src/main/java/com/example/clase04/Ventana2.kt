package com.example.clase04

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Ventana2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        btnV2.setOnClickListener{
            val saltar: Intent = Intent(this, MainActivity::class.java)
            startActivity(saltar)
        }
    }
}