package com.abed.magentaX.android.utils.screenHelpers

import android.util.DisplayMetrics
import android.util.TypedValue
import com.abed.magentaX.android.MagentaX.application
import com.abed.magentaX.android.resoures.appResources


/**
 * Defines a scale factor to use for scaling what'imageItem displayed
 */
// Set the screen width and height
class DisplayMetrics {

    companion object {
        private var dm: DisplayMetrics = application.resources.displayMetrics

        @JvmField
        val screenWidth: Int = dm.widthPixels

        @JvmField
        val screenHeight: Int = dm.heightPixels

        @JvmStatic
        fun density() = dm.density

        @JvmStatic
        fun dp(px: Float): Float =
                TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, px,
                        application.resources.displayMetrics)

        @JvmStatic
        fun dp(px: Int): Int =
                TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, px.toFloat(),
                        application.resources.displayMetrics).toInt()

        @JvmStatic
        fun pixelsToSp(px: Float): Float {
            val scaledDensity = appResources.displayMetrics.scaledDensity
            return px / scaledDensity
        }
    }
}


