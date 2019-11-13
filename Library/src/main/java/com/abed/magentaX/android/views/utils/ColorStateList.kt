package com.abed.magentaX.android.views.utils

import android.content.res.ColorStateList
import androidx.annotation.ColorRes
import com.abed.magentaX.android.resoures.colorOf

fun setColorOfStateList(@ColorRes color: Int) =
        ColorStateList.valueOf(colorOf(color))

