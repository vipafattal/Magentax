package com.codebox.lib.android.viewGroup

import android.view.View
import android.view.ViewGroup
import com.codebox.lib.standard.lambda.unitFun

fun ViewGroup.allChild(): List<View> {
    val arrayList = ArrayList<View>()

    for (child in 0 until childCount) {
        arrayList.add(this.getChildAt(child) as View)
    }
    return arrayList
}

fun ViewGroup.doAllChildsExcepte(predict:Boolean,block:unitFun){
    if (predict){
        block.invoke()
    }
}