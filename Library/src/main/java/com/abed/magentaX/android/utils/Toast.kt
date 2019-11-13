package com.abed.magentaX.android.utils

import android.widget.Toast
import com.abed.magentaX.android.os.MagentaX.appContext

fun longToast(text: String) {
    Toast.makeText(appContext, text, Toast.LENGTH_LONG).show()
}

fun shortToast(text: String) {
    Toast.makeText(appContext, text, Toast.LENGTH_SHORT).show()
}