package com.codebox.lib.libHelpers

import android.content.Context
import android.util.TypedValue
import androidx.annotation.AttrRes
import androidx.annotation.ColorInt
import androidx.core.content.ContextCompat
import com.codebox.lib.R


@ColorInt
internal fun getAttributeColor(context: Context, @AttrRes colorAttribute: Int): Int {
    val attrs = intArrayOf(colorAttribute)
    val ta = context.obtainStyledAttributes(attrs)
    /*Get the color resourceID that we want (the first index, and only item, in the
    attrs array). Use ContextCompat to get the color according to the theme.
    */
    @ColorInt val color = ContextCompat.getColor(context,
            ta.getResourceId(0, -1))
    // ALWAYS call recycle() on the TypedArray when you’re done.
    ta.recycle()
    return color
}

fun getThemeAccentColor(context: Context): Int {

    val typedValue = TypedValue()
    val a = context.obtainStyledAttributes(typedValue.data, intArrayOf(R.attr.colorAccent))
    val color = a.getColor(0, 0)
    a.recycle()

    return color
}
