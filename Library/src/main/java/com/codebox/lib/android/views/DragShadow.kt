package com.codebox.lib.android.views

import android.content.ClipData
import android.os.Build
import android.view.View

fun View.enableViewMotionShadow() {

    val data = ClipData.newPlainText("", "")

    val myDragShadowBuilder = View.DragShadowBuilder(this)

    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N)
        this.startDragAndDrop(data, myDragShadowBuilder, this, 0)
    else
        this.startDrag(data, myDragShadowBuilder, this, 0)

}
