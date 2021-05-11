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
    lateinit var imgIndividualBack: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_individual_portolio)

        imgIndividualPortolio = findViewById(R.id.imgBit)
        imgIndividualBack = findViewById(R.id.imgIndividualBack)

        imgIndividualPortolio.setOnClickListener {
            val intent: Intent = Intent(this@IndividualPortolio, CardExpanded::class.java)
            startActivity(intent)
        }

        imgIndividualBack.setOnClickListener {
            val intent1: Intent = Intent(this@IndividualPortolio, Home::class.java)
            startActivity(intent1)
        }
    }
}