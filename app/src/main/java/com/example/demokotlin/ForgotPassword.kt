package com.example.demokotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.ActionBar.DISPLAY_SHOW_CUSTOM

class ForgotPassword : AppCompatActivity() {

    lateinit var btnRequest: Button
    lateinit var imgForgotPassword: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        btnRequest = findViewById(R.id.btnRequest)
        imgForgotPassword = findViewById(R.id.imgForgotBack)

        btnRequest.setOnClickListener {
            val intent: Intent = Intent(this@ForgotPassword, OTP::class.java)
            startActivity(intent)
        }

        imgForgotPassword.setOnClickListener {
            val intent1: Intent = Intent(this@ForgotPassword, Login::class.java)
            startActivity(intent1)
        }
    }
}