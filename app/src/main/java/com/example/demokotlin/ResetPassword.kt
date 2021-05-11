package com.example.demokotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.ActionBar

class ResetPassword : AppCompatActivity() {
    
    lateinit var btnResetPassword: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reset_password)

        val actionBar = supportActionBar
        actionBar!!.title = "Reset Password"
        actionBar.displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM
        actionBar.setCustomView(R.layout.back)
        actionBar.setDisplayShowCustomEnabled(true)
        actionBar.setDisplayHomeAsUpEnabled(true)
        
        btnResetPassword = findViewById(R.id.btnSetPassword)
        btnResetPassword.setOnClickListener { 
            val intent: Intent = Intent(this@ResetPassword, Login::class.java)
            startActivity(intent)
        }
    }
}