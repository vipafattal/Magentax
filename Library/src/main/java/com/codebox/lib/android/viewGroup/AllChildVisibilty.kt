package com.codebox.lib.android.viewGroup

import android.view.View
import android.view.ViewGroup
import com.codebox.lib.android.views.utils.gone
import com.codebox.lib.android.views.utils.invisible

/**
 * control all child visibility of ViewGroup
 */

fun ViewGroup.allChildesInivisble() {
    for (child in 0 until childCount) {
        getChildAt(child).invisible()
    }
}


fun ViewGroup.allChildesGone() {
    for (child in 0 until childCount) {
        getChildAt(child).gone()
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

