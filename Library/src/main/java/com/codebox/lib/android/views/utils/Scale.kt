package com.codebox.lib.android.views.utils

import android.view.View

infix fun View.scale(value: Float) {
    scaleX = value
    scaleY = value
}

fun View.scale(X: Float, Y: Float) {
    scaleX = X
    scaleY = Y
}
