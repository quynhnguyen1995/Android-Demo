package com.example.demokotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.ActionBar.DISPLAY_SHOW_CUSTOM

class ForgotPassword : AppCompatActivity() {

    lateinit var btnRequest: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        val actionBar = supportActionBar
        actionBar!!.title = "Forgot Password"
        actionBar.displayOptions = DISPLAY_SHOW_CUSTOM
        actionBar.setCustomView(R.layout.back)
        actionBar.setDisplayShowCustomEnabled(true)
        actionBar.setDisplayHomeAsUpEnabled(true)

        btnRequest = findViewById(R.id.btnRequest)
        btnRequest.setOnClickListener {
            val intent: Intent = Intent(this@ForgotPassword, OTP::class.java)
            startActivity(intent)
        }
    }
}