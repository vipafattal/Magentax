package com.abed.magentaX.android.utils

import android.widget.Toast
import com.abed.magentaX.android.MagentaX.application

fun longToast(text: String) {
    Toast.makeText(application, text, Toast.LENGTH_LONG).show()
}

fun shortToast(text: String) {
    Toast.makeText(application, text, Toast.LENGTH_SHORT).show()
}