package com.example.demokotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class Notifications : AppCompatActivity() {

    lateinit var imgNotificationBack: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notifications)

        imgNotificationBack = findViewById(R.id.imgNotificationBack)

        imgNotificationBack.setOnClickListener {
            val intent: Intent = Intent(this@Notifications, Home::class.java)
            startActivity(intent)
        }
    }
}