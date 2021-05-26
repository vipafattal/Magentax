package com.abed.magentaX.android.widgets.snackbar

import android.os.Build
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import com.abed.magentaX.R
import com.abed.magentaX.android.resoures.drawableOf
import com.abed.magentaX.android.utils.screenHelpers.DisplayMetrics.Companion.dp
import com.google.android.material.snackbar.Snackbar


@RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
fun Snackbar.material(isWithBottom: Boolean = false): Snackbar {
    view.background = drawableOf(R.drawable.bg_snackbar)
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




