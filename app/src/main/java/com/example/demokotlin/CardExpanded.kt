package com.example.demokotlin

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.ActionBar.DISPLAY_SHOW_CUSTOM

class CardExpanded : AppCompatActivity() {

    lateinit var btnCardExpanded: Button
    lateinit var lnCardExpanded: LinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_expanded)

        val actionBar = supportActionBar
        actionBar!!.title = "Bitcoin"
        actionBar.displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM
        actionBar.setCustomView(R.layout.back_icon)
        actionBar.setDisplayShowCustomEnabled(true)
        actionBar.setDisplayHomeAsUpEnabled(true)

        btnCardExpanded = findViewById(R.id.btnCardExpanded)
        lnCardExpanded = findViewById(R.id.lnCardExpanded)

        lnCardExpanded.setOnClickListener {
            val intent1: Intent = Intent(this@CardExpanded, Keypad::class.java)
            startActivity(intent1)
        }
        btnCardExpanded.setOnClickListener {
            val intent: Intent = Intent(this@CardExpanded, OrderPlaced::class.java)
            startActivity(intent)
        }
    }
}