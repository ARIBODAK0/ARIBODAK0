package com.btcx.vault.util

import java.io.File

object FileUtil {

    fun read(file: File): ByteArray = file.readBytes()

    fun write(file: File, data: ByteArray) {
        file.parentFile?.mkdirs()
        file.writeBytes(data)
    }
}