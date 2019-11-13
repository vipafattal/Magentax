package com.abed.magentaX.android.widgets.textView

import android.util.TypedValue
import android.widget.TextView
import com.abed.magentaX.android.utils.screenHelpers.pixelsToSp

var TextView.sizeInSp: Float
    get() = pixelsToSp(textSize)
    set(value) = setTextSize(TypedValue.COMPLEX_UNIT_SP, value)

var TextView.textColor: Int
    get() = currentTextColor
    set(v) = setTextColor(v)