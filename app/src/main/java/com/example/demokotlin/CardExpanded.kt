package com.example.demokotlin

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.ActionBar.DISPLAY_SHOW_CUSTOM

class CardExpanded : AppCompatActivity() {

    lateinit var btnCardExpanded: Button
    lateinit var lnCardExpanded: LinearLayout
    lateinit var imgCardBack: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_expanded)


        btnCardExpanded = findViewById(R.id.btnCardExpanded)
        lnCardExpanded = findViewById(R.id.lnCardExpanded)
        imgCardBack = findViewById(R.id.imgCardBack)

        lnCardExpanded.setOnClickListener {
            val intent1: Intent = Intent(this@CardExpanded, Keypad::class.java)
            startActivity(intent1)
        }
        btnCardExpanded.setOnClickListener {
            val intent: Intent = Intent(this@CardExpanded, OrderPlaced::class.java)
            startActivity(intent)
        }
        imgCardBack.setOnClickListener {
            val intent2: Intent = Intent(this@CardExpanded, IndividualPortolio::class.java)
            startActivity(intent2)
        }

    }
}