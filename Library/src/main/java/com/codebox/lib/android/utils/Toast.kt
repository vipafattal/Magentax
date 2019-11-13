package com.codebox.lib.android.utils

import android.widget.Toast
import com.codebox.lib.android.os.MagentaX.appContext

fun longToast(text: String) {
    Toast.makeText(appContext, text, Toast.LENGTH_LONG).show()
}

fun shortToast(text: String) {
    Toast.makeText(appContext, text, Toast.LENGTH_SHORT).show()
}