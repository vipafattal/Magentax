package com.abed.magentaX.android.widgets.snackbar

import com.abed.magentaX.standard.lambda.unitFun
import com.google.android.material.snackbar.Snackbar


inline fun Snackbar.onDismissed(crossinline block: unitFun) {
    addCallback(object : Snackbar.Callback() {
        override fun onDismissed(transientBottomBar: Snackbar?, event: Int) {
            super.onDismissed(transientBottomBar, event)
            block()
        }

    })
}

inline fun Snackbar.onShown(crossinline block: unitFun) {
    addCallback(object : Snackbar.Callback() {
        override fun onDismissed(transientBottomBar: Snackbar?, event: Int) {
            super.onDismissed(transientBottomBar, event)
            block()
        }
    })
}