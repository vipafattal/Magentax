package com.codebox.lib.android.views.utils

import android.view.View


fun View.visible() {
    this.visibility = View.VISIBLE
}

fun View.invisible() {
    this.visibility = View.INVISIBLE
}

fun View.gone() {
    this.visibility = View.GONE
}

/**
 * for all child in view parent for example:
 * relativeParent
 */

/*
fun List<View>.Invisible() {
    for (view in this){
        view.invisible()
    }
}

fun List<View>.Gone() {
    for (view in this){
        view.gone()
    }
}

fun List<View>.Visible() {
    for (view in this){
        view.visible()
    }
}*/
