package com.btcx.vault.crypto

object SecureWipe {
    fun wipe(bytes: ByteArray) {
        for (i in bytes.indices) bytes[i] = 0
    }
}