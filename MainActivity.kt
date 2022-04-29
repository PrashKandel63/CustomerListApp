package com.example.customerlist

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.startbtn)
        button.setOnClickListener {
            val intent = Intent(this, CustomerForm::class.java)
            startActivity(intent)
        }
    }
}