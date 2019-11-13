package com.codebox.lib.android.views.listeners

import android.view.View
import com.codebox.lib.android.animators.Interval
import com.codebox.lib.standard.lambda.unitFun


inline fun <T : View> T.onClick(crossinline block: T.() -> Unit) {
    setOnClickListener {
        block()
    }
}

inline fun onClicks(vararg views: View, crossinline block: unitFun) {
    for (view in views)
        view.setOnClickListener {
            block.invoke()
        }
}

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

fun View.OnClickListener.activeClick(vararg views: View) {
    for (button in views) {
        button.setOnClickListener(this)
    }
}

