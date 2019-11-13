package com.abed.magentaX.android.actvity

import android.content.Context
import android.content.Intent

inline fun <reified T : Any> Context.launchActivity() {
    val intent = newIntent<T>()
    startActivity(intent)
}

inline fun <reified T : Any> Context.newIntent(): Intent =
        Intent(this, T::class.java)