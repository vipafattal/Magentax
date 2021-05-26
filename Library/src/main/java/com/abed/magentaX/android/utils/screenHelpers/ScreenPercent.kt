package com.abed.magentaX.android.utils.screenHelpers

import com.abed.magentaX.android.utils.screenHelpers.DisplayMetrics.Companion.screenHeight
import com.abed.magentaX.android.utils.screenHelpers.DisplayMetrics.Companion.screenWidth

val halfScreenY = screenHeight / 2.000
val halfScreenX = screenWidth / 2.000

fun widthPercent(percent: Int): Float = screenWidth.times(percent.toFloat() / 100)
fun heightPercent(percent: Int): Float = screenHeight.times(percent.toFloat() / 100)
