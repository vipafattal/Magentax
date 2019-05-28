package com.codebox.lib.android.widgets.fabButton

import android.content.res.ColorStateList
import com.codebox.lib.android.resoures.Colour
import com.google.android.material.floatingactionbutton.FloatingActionButton


infix fun FloatingActionButton.colour(color: Int): Unit {
    this.backgroundTintList = ColorStateList.valueOf(Colour(color))
}