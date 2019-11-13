package com.codebox.lib.android.views.utils

import android.content.res.ColorStateList
import androidx.annotation.ColorRes
import com.codebox.lib.android.resoures.colorOf

fun setColorOfStateList(@ColorRes color: Int) =
        ColorStateList.valueOf(colorOf(color))

