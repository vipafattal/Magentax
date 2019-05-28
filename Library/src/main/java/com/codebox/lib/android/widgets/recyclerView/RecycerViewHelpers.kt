package com.codebox.lib.android.widgets.recyclerView

import android.view.animation.AnimationUtils
import android.widget.LinearLayout

fun androidx.recyclerview.widget.RecyclerView.animateItems(animFile: Int) {
    val controller = AnimationUtils.loadLayoutAnimation(context, animFile)
    layoutAnimation = controller
    adapter!!.notifyDataSetChanged()
    scheduleLayoutAnimation()
}

fun androidx.recyclerview.widget.RecyclerView.LinearLayoutV() {
    layoutManager = androidx.recyclerview.widget.LinearLayoutManager(context, LinearLayout.VERTICAL, false)
}

fun androidx.recyclerview.widget.RecyclerView.LinearLayoutH() {
    layoutManager = androidx.recyclerview.widget.LinearLayoutManager(context, LinearLayout.HORIZONTAL, false)
}