package com.example.demokotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.ActionBar

class ResetPassword : AppCompatActivity() {

    lateinit var imgResetBack: ImageView
    lateinit var btnResetPassword: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reset_password)
        
        btnResetPassword = findViewById(R.id.btnSetPassword)
        imgResetBack = findViewById(R.id.imgResetBack)

        btnResetPassword.setOnClickListener { 
            val intent: Intent = Intent(this@ResetPassword, Login::class.java)
            startActivity(intent)
        }

        imgResetBack.setOnClickListener {
            val intent1: Intent = Intent(this@ResetPassword, OTP::class.java)
            startActivity(intent1)
        }
    }
}