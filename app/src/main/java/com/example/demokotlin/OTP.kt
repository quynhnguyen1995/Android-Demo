package com.example.demokotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.ActionBar

class OTP : AppCompatActivity() {

    lateinit var btnContinue: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_o_t_p)

        val actionBar = supportActionBar
        actionBar!!.title = "OTP Verification"
        actionBar.displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM
        actionBar.setCustomView(R.layout.back)
        actionBar.setDisplayShowCustomEnabled(true)
        actionBar.setDisplayHomeAsUpEnabled(true)
        actionBar.setDisplayHomeAsUpEnabled(true)

        btnContinue = findViewById(R.id.btnContinue)
        btnContinue.setOnClickListener {
            val intent: Intent = Intent(this@OTP, ResetPassword::class.java)
            startActivity(intent)
        }
    }
}