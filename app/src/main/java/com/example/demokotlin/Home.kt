package com.example.demokotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import android.widget.Toolbar
import androidx.appcompat.app.ActionBar.DISPLAY_SHOW_CUSTOM
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView
import java.util.zip.Inflater

class Home : AppCompatActivity() {

     lateinit var drawHome: DrawerLayout
     lateinit var navigationView: NavigationView
     lateinit var imgMenu: ImageView
     lateinit var imgNotifications: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)



        drawHome = findViewById(R.id.drawHome)
        navigationView = findViewById(R.id.nav_view)
        imgMenu = findViewById(R.id.imgMenu)
        imgNotifications = findViewById(R.id.imgNotification)

        imgMenu.setOnClickListener {
            drawHome.openDrawer(GravityCompat.START)
        }

        navigationView.itemIconTintList
        imgNotifications.setOnClickListener {
            val intent: Intent = Intent(this@Home, Notifications::class.java)
            startActivity(intent)
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        val inflater = menuInflater
//        inflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.sign_out->{
                startActivity(Intent(this@Home,Login::class.java))
                finish()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }


}