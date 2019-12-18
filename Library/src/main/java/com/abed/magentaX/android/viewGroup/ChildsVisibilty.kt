package com.abed.magentaX.android.viewGroup

import android.view.View
import android.view.ViewGroup
import com.abed.magentaX.android.views.gone
import com.abed.magentaX.android.views.invisible
import com.abed.magentaX.android.views.visible

/**
 * control all child visibility of ViewGroup
 */

fun ViewGroup.allChildesInvisible() {
    for (child in 0 until childCount) {
        getChildAt(child).invisible()
    }
}


fun ViewGroup.allChildesGone() {
    for (child in 0 until childCount) {
        getChildAt(child).gone()
    }
}

fun ViewGroup.allChildesVisibleExcept(v: View) {
    for (i in 0 until this.childCount) {
        val child = this.getChildAt(i)
        if (child == v)
            continue
        else
            child.visible()
    }
}

fun ViewGroup.allChildesGoneExcept(v: View) {
    for (i in 0 until this.childCount) {
        val child = this.getChildAt(i)
        if (child == v)
            continue
        else
            child.gone()
    }
}

fun ViewGroup.allChildesInvisibleExcept(v: View) {
    for (i in 0 until this.childCount) {
        val child = this.getChildAt(i)

        if (child == v)
            continue
        else
            child.invisible()
    }
}

