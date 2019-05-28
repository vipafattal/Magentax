package com.codebox.lib.android.views.listeners

import android.view.View

fun View.OnClickListener.activeClick(vararg views: View) {
    for (button in views) {
        button.setOnClickListener(this)
    }
}