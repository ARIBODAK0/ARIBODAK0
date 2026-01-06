package com.btcx.vault.crypto

import java.security.MessageDigest
import java.util.UUID

object WalletCode {

    fun generate(): String {
        val seed = UUID.randomUUID().toString()
        val hash = MessageDigest.getInstance("SHA-256")
            .digest(seed.toByteArray())
        return hash.joinToString("") { "%02x".format(it) }
    }
}