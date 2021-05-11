package com.example.demokotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.ActionBar.DISPLAY_SHOW_CUSTOM

class IndividualPortolio : AppCompatActivity() {

    lateinit var imgIndividualPortolio: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_individual_portolio)

        val actionBar = supportActionBar
        actionBar!!.title = "Your Coins"
        actionBar.setDisplayHomeAsUpEnabled(true)

        imgIndividualPortolio = findViewById(R.id.imgBit)
        imgIndividualPortolio.setOnClickListener {
            val intent: Intent = Intent(this@IndividualPortolio, CardExpanded::class.java)
            startActivity(intent)
        }
    }
}