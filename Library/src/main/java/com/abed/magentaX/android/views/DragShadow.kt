package com.abed.magentaX.android.views

import android.content.ClipData
import android.os.Build
import android.view.View

fun View.enableViewMotionShadow(dragLabel: String = "", dragText: String = "") {

    val data = ClipData.newPlainText(dragLabel, dragText)

    val myDragShadowBuilder = View.DragShadowBuilder(this)

    @Suppress("DEPRECATION")
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N)
        this.startDragAndDrop(data, myDragShadowBuilder, this, 0)
    else
        this.startDrag(data, myDragShadowBuilder, this, 0)

}
