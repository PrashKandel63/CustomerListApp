package com.example.customerlist

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class CustomerForm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customer_form)
        val nextbtn = findViewById<Button>(R.id.nextbtn)
        nextbtn.setOnClickListener {
            val i = Intent(this, ListOfCustomers::class.java)
            startActivity(i)
        }
        val fname = findViewById<EditText>(R.id.fnametxt)
        fname.visibility = View.VISIBLE
        val lname = findViewById<EditText>(R.id.lnametxt)
        lname.visibility = View.VISIBLE
        val street = findViewById<EditText>(R.id.streetEditText)
        street.visibility = View.VISIBLE
        val city = findViewById<EditText>(R.id.cityEditText)
        city.visibility = View.VISIBLE
        val statetxt = findViewById<EditText>(R.id.stateEditText)
        statetxt.visibility = View.VISIBLE
        val phone = findViewById<EditText>(R.id.editTextNumber)
        phone.visibility = View.VISIBLE
        val addbtn = findViewById<Button>(R.id.addbtn)
        addbtn.setOnClickListener {
            val firstName = fname.text
            Toast.makeText(this, firstName, Toast.LENGTH_LONG).show()
        }
    }
}