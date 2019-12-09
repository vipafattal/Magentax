package com.abed.magentaX.android.views.utils

import android.view.View
import androidx.core.view.ViewCompat

fun View.applyTransitionName(name:String){
    ViewCompat.setTransitionName(this,name)
}