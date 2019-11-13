package com.abed.magentaX.android.widgets.snackbar

import android.widget.TextView
import com.abed.magentaX.R
import com.abed.magentaX.android.resoures.colorOf
import com.google.android.material.snackbar.Snackbar

fun Snackbar.setSnackbarTextColor(textColor: Int) {

    val tv: TextView = view.findViewById(R.id.snackbar_text)
    tv.setTextColor(colorOf(textColor))

}