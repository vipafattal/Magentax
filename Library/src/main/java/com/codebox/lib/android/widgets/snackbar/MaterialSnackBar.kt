package com.codebox.lib.android.widgets.snackbar

import android.view.ViewGroup
import com.codebox.lib.R
import com.codebox.lib.android.resoures.Image
import com.codebox.lib.android.utils.screenHelpers.dp
import com.google.android.material.snackbar.Snackbar


fun Snackbar.material(isWithBottom: Boolean = false): Snackbar {
    view.background = Image(R.drawable.bg_snackbar)
    val params = view.layoutParams as ViewGroup.MarginLayoutParams

    params.setMargins(
            params.leftMargin + dp(12),
            params.topMargin,
            params.rightMargin + dp(12),
            if (isWithBottom)
                params.bottomMargin + dp(105)
            else
                params.bottomMargin + dp(12))
    view.layoutParams = params

    return this
}




