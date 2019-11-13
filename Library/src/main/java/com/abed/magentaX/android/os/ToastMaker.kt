package com.abed.magentaX.android.os

import android.content.Context
import android.util.Log
import android.widget.Toast

fun Context.errorNotifier(userMsg: String, loggerMsg: String, duration: Int = Toast.LENGTH_LONG) {
    Log.d(userMsg, loggerMsg)
    Toast.makeText(this, userMsg, duration).show()
}