package com.codebox.lib.android.widgets.textVIew

import android.util.TypedValue
import android.widget.TextView
import com.codebox.lib.android.utils.screenHelpers.pixelsToSp

var TextView.sizeInSp: Float
    get() = pixelsToSp(textSize)
    set(value) = setTextSize(TypedValue.COMPLEX_UNIT_SP, value)