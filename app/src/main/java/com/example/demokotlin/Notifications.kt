package com.example.demokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Notifications : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notifications)

        val actionBar = supportActionBar
        actionBar!!.title = "Notifications"
        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}