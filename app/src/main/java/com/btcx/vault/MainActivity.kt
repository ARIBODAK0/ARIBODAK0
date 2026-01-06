package com.btcx.vault

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.btcx.vault.ui.SendActivity
import com.btcx.vault.ui.ReceiveActivity
import com.btcx.vault.ui.VaultActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // simple router
        startActivity(Intent(this, VaultActivity::class.java))
        finish()
    }
}