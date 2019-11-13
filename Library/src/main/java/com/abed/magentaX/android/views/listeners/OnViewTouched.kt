package com.abed.magentaX.android.views.listeners

import android.view.MotionEvent
import android.view.View

inline fun View.viewOnTouchedDown(crossinline onTouch: (View) -> Unit) =
        setOnTouchListener { v, event ->
            if (event?.action == MotionEvent.ACTION_DOWN) {
                onTouch(this)
                true
            } else false
        }