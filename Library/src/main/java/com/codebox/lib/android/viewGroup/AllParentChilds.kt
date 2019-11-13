package com.codebox.lib.android.viewGroup

import android.view.View
import android.view.ViewGroup
import com.codebox.lib.standard.lambda.unitFun

val ViewGroup.children: List<View>
    get() {
        val arrayList = ArrayList<View>()

        for (child in 0 until childCount) {
            arrayList.add(this.getChildAt(child) as View)
        }
        return arrayList
    }

inline fun ViewGroup.onEachChild(block: View.() -> Unit) {
    for (index in 0 until childCount)
        block(this[index])
}

inline fun ViewGroup.onEachChildExcept(predict: Boolean, block: unitFun) {
    onEachChild {
        if (!predict)
            block.invoke()
    }


}