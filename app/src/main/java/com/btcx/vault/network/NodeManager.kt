package com.btcx.vault.network

import java.security.MessageDigest
import java.util.UUID

object NodeManager {

    val nodeId: String = run {
        val raw = UUID.randomUUID().toString()
        val hash = MessageDigest.getInstance("SHA-256")
            .digest(raw.toByteArray())
        hash.joinToString("") { "%02x".format(it) }
    }

    private val peers = mutableSetOf<String>()

    fun registerPeer(peerId: String) {
        peers.add(peerId)
    }

    fun getPeers(): Set<String> = peers
}