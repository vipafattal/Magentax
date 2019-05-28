package com.codebox.lib.android.utils.colors

import android.graphics.Color
import com.codebox.lib.android.resoures.Colour


/**
 * @colorID it's from colors files passed
 * returns String E.X:#000
 */
fun hexColorToString(colorID: Int): String = '#' + Integer.toHexString(Colour(colorID))

fun hexParse(colorID: Int): Int = Color.parseColor(hexColorToString(colorID))

fun hexStringToColor(str: String): Int = Color.parseColor(str)

fun arrayOfHexStringToColor(vararg elements: String): ArrayList<Int> {
    val intColorArray = ArrayList<Int>()
    elements.forEach {
        intColorArray.add(hexStringToColor(it))
    }
    return intColorArray
}

