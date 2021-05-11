package com.example.demokotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.ActionBar

class OrderPlaced : AppCompatActivity() {

    lateinit var imgOrderPlacedBack: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.order_placed)

        imgOrderPlacedBack = findViewById(R.id.imgOrderPlaced)

        imgOrderPlacedBack.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?) {
                val intent: Intent = Intent(this@OrderPlaced, IndividualPortolio::class.java)
                startActivity(intent)
            }

        })
    }
}