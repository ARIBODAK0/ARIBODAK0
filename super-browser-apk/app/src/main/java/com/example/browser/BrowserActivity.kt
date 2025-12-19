package com.example.browser

import android.content.Context
import android.webkit.WebView

object TabManager {
    private val tabs = mutableListOf<WebView>()
    fun newTab(context: Context, url: String): WebView {
        val w = WebView(context)
        w.settings.javaScriptEnabled = true
        w.loadUrl(url)
        tabs.add(w)
        return w
    }
}

