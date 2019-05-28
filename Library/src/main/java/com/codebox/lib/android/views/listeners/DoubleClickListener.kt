package com.codebox.lib.android.views.listeners

import android.view.View
import com.codebox.lib.android.animators.Interval



inline fun View.setOnDoubleTap(tapInterval: Interval=300, crossinline doOnDoubleClick: (v: View) -> Unit) {
    var lastClickTime: Long = 0

    setOnClickListener {
        val clickTime = System.currentTimeMillis()
        if (clickTime - lastClickTime < tapInterval) {
            doOnDoubleClick.invoke(this)
        }
        lastClickTime = clickTime
    }
}
