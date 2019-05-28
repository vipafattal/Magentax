package com.codebox.lib.android.views

import android.graphics.PorterDuff
import android.view.View
import android.view.ViewGroup

fun View.changeBackground(color: Int) {
    background.mutate().setColorFilter(color, PorterDuff.Mode.SRC_ATOP)
}

fun ViewGroup.changeBackground(color: Int) {
    background.mutate().setColorFilter(color, PorterDuff.Mode.SRC_ATOP)
}