package com.abed.magentaX.android.context

import android.content.Context
import android.content.Intent
import android.util.TypedValue
import androidx.annotation.AttrRes
import androidx.annotation.ColorInt
import com.abed.magentaX.R


inline fun <reified T : Any> Context.launchActivity() {
    val intent = newIntent<T>()
    startActivity(intent)
}

inline fun <reified T : Any> Context.newIntent(): Intent = Intent(this, T::class.java)


@ColorInt
fun Context.colorOfAttr(@AttrRes colorAttribute: Int): Int {
    val typedValue = TypedValue()
    theme.resolveAttribute(colorAttribute, typedValue, true)
    return typedValue.data
}

val Context.colorAccent: Int
    get() = colorOfAttr(R.attr.colorAccent)

val Context.colorPrimary: Int
    get() = colorOfAttr(R.attr.colorPrimary)

val Context.colorPrimaryDark: Int
    get() = colorOfAttr(R.attr.colorPrimaryDark)

val Context.colorSecondary: Int
    get() = colorOfAttr(R.attr.colorSecondary)