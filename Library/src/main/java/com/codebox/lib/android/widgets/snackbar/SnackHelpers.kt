package com.codebox.lib.android.widgets.snackbar

import android.widget.TextView
import com.codebox.lib.R
import com.codebox.lib.android.resoures.colorOf
import com.google.android.material.snackbar.Snackbar

fun Snackbar.setSnackbarTextColor(textColor: Int) {

    val tv: TextView = view.findViewById(R.id.snackbar_text)
    tv.setTextColor(colorOf(textColor))

}