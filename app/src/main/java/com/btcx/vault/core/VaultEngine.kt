package com.btcx.vault.core

import com.btcx.vault.crypto.*
import com.btcx.vault.network.IpfsClient
import java.security.SecureRandom

object VaultEngine {

    fun seal(data: ByteArray, walletCode: String): VaultRecord {
        val salt = SecureRandom().generateSeed(16)
        val key = KeyDerivation.derive(walletCode, salt)
        val (iv, cipher) = AESGCM.encrypt(data, key)
        val payload = salt + iv + cipher
        val cid = IpfsClient.add(payload)
        val mac = Hmac.sign(payload, key)
        return VaultRecord(cid, mac, payload.size.toLong())
    }

    fun open(record: VaultRecord, walletCode: String): ByteArray {
        val payload = IpfsClient.get(record.cid) ?: error("Data not found")
        val salt = payload.copyOfRange(0, 16)
        val iv = payload.copyOfRange(16, 28)
        val cipher = payload.copyOfRange(28, payload.size)
        val key = KeyDerivation.derive(walletCode, salt)
        require(Hmac.verify(payload, key, record.hmac)) { "Integrity failed" }
        return AESGCM.decrypt(iv, cipher, key)
    }
}