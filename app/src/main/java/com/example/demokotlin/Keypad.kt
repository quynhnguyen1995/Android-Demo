package com.example.demokotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.ActionBar

class Keypad : AppCompatActivity() {

    lateinit var btnKeypad: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_keypad)

        val actionBar = supportActionBar
        actionBar!!.title = "Bitcoin"
        actionBar.displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM
        actionBar.setCustomView(R.layout.back_icon)
        actionBar.setDisplayShowCustomEnabled(true)
        actionBar.setDisplayHomeAsUpEnabled(true)

        btnKeypad = findViewById(R.id.btnKeypad)
        btnKeypad.setOnClickListener {
            val intent: Intent = Intent(this@Keypad, OrderPlaced::class.java)
            startActivity(intent)
        }
    }
}