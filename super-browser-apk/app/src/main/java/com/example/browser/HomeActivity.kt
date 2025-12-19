package com.example.browser

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }

    fun openGoogle(v: android.view.View) {
        open("https://www.google.com")
    }

    fun openYoutube(v: android.view.View) {
        open("https://www.youtube.com")
    }

    private fun open(url: String) {
        val i = Intent(this, BrowserActivity::class.java)
        i.putExtra("url", url)
        startActivity(i)
    }
}

