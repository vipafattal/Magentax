package com.abed.magentaX.android.widgets.textView

import android.graphics.Typeface
import android.util.TypedValue
import android.widget.TextView
import com.abed.magentaX.android.MagentaX
import com.abed.magentaX.android.utils.screenHelpers.DisplayMetrics.Companion.pixelsToSp

var TextView.sizeInSp: Float
    get() = pixelsToSp(textSize)
    set(value) = setTextSize(TypedValue.COMPLEX_UNIT_SP, value)

var TextView.textColor: Int
    get() = currentTextColor
    set(v) = setTextColor(v)

fun TextView.setFont(fontPath: String) {
    // Font path
    // Applying font
    val Cfont = Typeface.createFromAsset(MagentaX.application.assets, fontPath)
    this.typeface = Cfont

}