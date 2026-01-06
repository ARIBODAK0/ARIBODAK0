package com.btcx.vault.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.btcx.vault.core.VaultEngine
import com.btcx.vault.core.VaultRecord

class ReceiveActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val cid = intent.getStringExtra("cid") ?: return
        val hmac = intent.getStringExtra("hmac") ?: return
        val wallet = intent.getStringExtra("wallet") ?: return

        val record = VaultRecord(cid, hmac, 0)
        val data = VaultEngine.open(record, wallet)

        println("RECEIVED: ${String(data)}")
    }
}