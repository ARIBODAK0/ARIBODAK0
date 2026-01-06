package com.btcx.vault.crypto

import javax.crypto.Mac
import javax.crypto.spec.SecretKeySpec

object Hmac {

    fun sign(data: ByteArray, key: ByteArray): String {
        val mac = Mac.getInstance("HmacSHA256")
        mac.init(SecretKeySpec(key, "HmacSHA256"))
        return mac.doFinal(data).joinToString("") { "%02x".format(it) }
    }

    fun verify(data: ByteArray, key: ByteArray, sig: String): Boolean {
        return sign(data, key) == sig
    }
}