package com.codebox.lib.android.views.listeners

import android.view.View
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