package com.btcx.vault.network

object IpfsClient {

    fun add(data: ByteArray): String {
        // CID simulasi (hash)
        return data.hashCode().toString()
    }

    fun get(cid: String): ByteArray? {
        // placeholder fetch
        return null
    }
}