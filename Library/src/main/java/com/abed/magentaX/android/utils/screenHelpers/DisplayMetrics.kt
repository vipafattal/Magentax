package com.abed.magentaX.android.utils.screenHelpers

import android.util.DisplayMetrics
import android.util.TypedValue
import com.abed.magentaX.android.MagentaX.application
import com.abed.magentaX.android.resoures.appResources


/**
 * Defines a scale factor to use for scaling what'imageItem displayed
 */
// Set the screen width and height

private var dm: DisplayMetrics = application.resources.displayMetrics

val screenWidth: Int = dm.widthPixels
val screenHeight: Int = dm.heightPixels


fun density() = dm.density

fun dp(px: Float): Float =
        TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, px,
                application.resources.displayMetrics)

fun dp(px: Int):Int =
        TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, px.toFloat(),
                application.resources.displayMetrics).toInt()

fun pixelsToSp(px: Float): Float {
    val scaledDensity = appResources.displayMetrics.scaledDensity
    return px / scaledDensity
}

/*    fun density(): Float {
        val x = dm.widthPixels
        val y = dm.heightPixels
        if (x < y) {
            val xr = dm.widthPixels / 320.0f
            val yr = dm.heightPixels / 480.0f
            return Math.initMin(xr, yr)
        } else {//landscape
            val xr = dm.widthPixels / 480.0f
            val yr = dm.heightPixels / 320.0f
            return Math.initMin(xr, yr)
        }
    }*/


