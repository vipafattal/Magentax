package com.abed.magentaX.android.os.font

import android.graphics.Typeface

import android.widget.TextView
import com.abed.magentaX.android.os.MagentaX.appContext

/**
 * Created by Abed on 3/2/2018.
 */

/**
 * fonts from assets folder example:
 * "roboto_medium.ttf"
 */

fun TextView.setFont(fontPath: String) {
    // Font path
    // Applying font
    val Cfont = Typeface.createFromAsset(appContext.assets, fontPath)
    this.typeface = Cfont

}