package com.example.demokotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.ActionBar.DISPLAY_SHOW_CUSTOM

class Login : AppCompatActivity(){

    lateinit var txtForgotPassword: TextView
    lateinit var btnSignIn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val actionBar = supportActionBar
        actionBar!!.title = "Sign In"
        actionBar.displayOptions = DISPLAY_SHOW_CUSTOM
        actionBar.setCustomView(R.layout.back)
        actionBar.setDisplayShowCustomEnabled(true)

        txtForgotPassword = findViewById(R.id.txtForgotPassword)
        btnSignIn = findViewById(R.id.btnSignIn)

        txtForgotPassword.setOnClickListener {
            val intent: Intent = Intent(this@Login, ForgotPassword::class.java)
            startActivity(intent)
        }
        btnSignIn.setOnClickListener {
            val intent1: Intent = Intent(this@Login, Home::class.java)
            startActivity(intent1)
        }
    }
}
