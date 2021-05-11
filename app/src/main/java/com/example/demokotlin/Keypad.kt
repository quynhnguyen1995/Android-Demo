package com.example.demokotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.ActionBar

class Keypad : AppCompatActivity() {

    lateinit var btnKeypad: Button
    lateinit var imgKeypadBack: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_keypad)

        btnKeypad = findViewById(R.id.btnKeypad)
        imgKeypadBack = findViewById(R.id.imgKeypadBack)

        btnKeypad.setOnClickListener {
            val intent: Intent = Intent(this@Keypad, OrderPlaced::class.java)
            startActivity(intent)
        }

        imgKeypadBack.setOnClickListener {
            val intent1: Intent = Intent(this@Keypad, CardExpanded::class.java)
            startActivity(intent1)
        }
    }
}