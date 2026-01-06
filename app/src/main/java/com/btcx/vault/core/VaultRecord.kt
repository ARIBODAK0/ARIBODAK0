package com.btcx.vault.core

data class VaultRecord(
    val cid: String,
    val hmac: String,
    val size: Long
)