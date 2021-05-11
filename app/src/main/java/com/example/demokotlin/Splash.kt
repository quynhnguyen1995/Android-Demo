package com.example.demokotlin


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*
import kotlin.concurrent.schedule

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Timer("Login", false).schedule(500) {
            val intent: Intent = Intent(this@Splash, Login::class.java)
            startActivity(intent)
        }
    }

}