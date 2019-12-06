package com.abed.magentaX.android.actvity

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.inputmethod.InputMethodManager

inline fun <reified T : Any> Context.launchActivity() {
    val intent = newIntent<T>()
    startActivity(intent)
}

inline fun <reified T : Any> Context.newIntent(): Intent =
        Intent(this, T::class.java)

fun Activity.hideKeyboard() {
    val inputMethodManager = getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
    inputMethodManager.hideSoftInputFromWindow(window.decorView.rootView.windowToken, 0)
}

