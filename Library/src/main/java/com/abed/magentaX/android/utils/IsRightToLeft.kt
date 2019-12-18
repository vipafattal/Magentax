package com.abed.magentaX.android.utils

import androidx.core.text.TextUtilsCompat
import androidx.core.view.ViewCompat
import java.util.*

val isRightToLeft: Boolean
    get() = TextUtilsCompat.getLayoutDirectionFromLocale(Locale.getDefault()) == ViewCompat.LAYOUT_DIRECTION_RTL

val direction = if (isRightToLeft) -1 else 1
