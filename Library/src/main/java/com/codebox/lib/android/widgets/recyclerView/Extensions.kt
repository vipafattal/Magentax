package com.codebox.lib.android.widgets.recyclerView

import android.view.animation.AnimationUtils
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView



inline fun RecyclerView.onScroll(crossinline action: (dx: Int, dy: Int) -> Unit) {

    addOnScrollListener(object : RecyclerView.OnScrollListener() {
        override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
            super.onScrolled(recyclerView, dx, dy)
            action(dx, dy)
        }
    })
}

fun RecyclerView.LinearLayoutV(reverseLayout:Boolean = false): LinearLayoutManager {
    val manager = LinearLayoutManager(context, RecyclerView.VERTICAL, reverseLayout)
    layoutManager = manager
    return manager
}

fun RecyclerView.LinearLayoutH(reverseLayout:Boolean = false): LinearLayoutManager {
    val manager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, reverseLayout)
    layoutManager = manager
    return manager
}

fun RecyclerView.animateItems(animFile: Int) {
    val controller = AnimationUtils.loadLayoutAnimation(context, animFile)
    layoutAnimation = controller
    adapter!!.notifyDataSetChanged()
    scheduleLayoutAnimation()
}