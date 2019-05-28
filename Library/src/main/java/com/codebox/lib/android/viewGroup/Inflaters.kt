package com.codebox.lib.android.viewGroup

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

//Array-like operations a[i] == a.get(i)
operator fun ViewGroup.get(position: Int): View = getChildAt(position)

fun ViewGroup.inflater(layoutRes: Int): View {
    return LayoutInflater.from(context).inflate(layoutRes, this, false)
}