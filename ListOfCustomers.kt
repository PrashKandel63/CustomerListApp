package com.example.customerlist

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class ListOfCustomers : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_of_customers)

        // use arrayadapter and define an array
        val arrayAdapter: ArrayAdapter<*>
        val customers = arrayOf(
            "Virat Kohli(123 Cricket Ally, Mumbai, India, 1234567890)", "Gordon Ramsay(456 Kitchen Hell Ave, London, UK, 2347778967", "Rajvir Kel(457 Ray St, Mystville, CT, 2033572357)",
            "James Kirk(2356 Enterprise Rd, IA, 2374689359)", "Kevin Hart(1976 Philadelphia, PA, 2155973475)"
        )

        // access the listView from xml file
        var mListView = findViewById<ListView>(R.id.customer_list_view)
        arrayAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, customers)
        mListView.adapter = arrayAdapter

    }
}