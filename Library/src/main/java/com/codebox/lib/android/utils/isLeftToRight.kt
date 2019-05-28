package com.codebox.lib.android.utils

import androidx.core.text.TextUtilsCompat
import androidx.core.view.ViewCompat
import java.util.*

val isRightToLeft: Int
    get() =
        if (TextUtilsCompat.getLayoutDirectionFromLocale(Locale.getDefault()) == ViewCompat.LAYOUT_DIRECTION_LTR) 1
        else -1

