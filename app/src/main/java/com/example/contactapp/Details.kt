package com.example.contactapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Details : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val tvName: TextView = findViewById(R.id.tvdName)

        val tvMobile: TextView = findViewById(R.id.tvdMobile)

        tvName.text = intent.getStringExtra("user_name")

        tvMobile.text = intent.getStringExtra("mobile_number")
    }
}