package com.btcx.vault.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.btcx.vault.core.VaultEngine
import com.btcx.vault.crypto.WalletCode

class SendActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val wallet = WalletCode.generate()
        val data = "HELLO BTCX".toByteArray()
        val record = VaultEngine.seal(data, wallet)

        println("CID: ${record.cid}")
        println("WALLET CODE: $wallet")
    }
}