package com.codebox.lib.android.utils.screenHelpers

val halfScreenY = screenHeight / 2.000
val halfScreenX = screenWidth / 2.000

fun widthPercent(percent: Int): Float = screenWidth.times(percent.toFloat() / 100)
fun heightPercent(percent: Int): Float = screenHeight.times(percent.toFloat() / 100)
