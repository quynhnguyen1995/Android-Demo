package com.example.demokotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.ActionBar

class OTP : AppCompatActivity() {

    lateinit var btnContinue: Button
    lateinit var imgOTPBack: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_o_t_p)

        btnContinue = findViewById(R.id.btnContinue)
        imgOTPBack = findViewById(R.id.imgOTP)

        btnContinue.setOnClickListener {
            val intent: Intent = Intent(this@OTP, ResetPassword::class.java)
            startActivity(intent)
        }

        imgOTPBack.setOnClickListener {
            val intent1: Intent = Intent(this@OTP, ForgotPassword::class.java)
            startActivity(intent1)
        }
    }
}