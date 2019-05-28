package com.codebox.lib.android.utils.colors

import com.codebox.lib.R
import com.codebox.lib.android.resoures.appResources
import java.util.*

fun randomColor(colorArr: IntArray): Int {
    val rnd = Random().nextInt(colorArr.size - 1)
    return colorArr[rnd]
}

fun A700Colors(): IntArray = appResources.getIntArray(R.array.A700)

