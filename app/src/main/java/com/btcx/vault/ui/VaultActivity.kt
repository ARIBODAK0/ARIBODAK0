package com.btcx.vault.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class VaultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // demo flow: send -> receive
        startActivity(Intent(this, SendActivity::class.java))
    }
}