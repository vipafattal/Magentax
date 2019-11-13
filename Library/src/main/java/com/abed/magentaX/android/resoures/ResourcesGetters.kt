package com.abed.magentaX.android.resoures

import android.content.Context
import android.content.res.Resources
import androidx.annotation.DrawableRes
import androidx.core.content.ContextCompat
import com.abed.magentaX.android.os.MagentaX.appContext

val appResources: Resources = appContext.resources


fun colorOf(colorID: Int, context: Context = appContext): Int = ContextCompat.getColor(context, colorID)
fun drawableOf(@DrawableRes drawableImg: Int, context: Context = appContext) = ContextCompat.getDrawable(context, drawableImg)
fun stringer(stringID: Int, mContext: Context = appContext): String = mContext.resources.getString(stringID)
fun stringify(stringID: Int, mContext: Context): String = mContext.resources.getString(stringID)


/**
 * @resourcesID is string resources
 *  arrayOfStrings(R.string.appName,R.string.Welcome,R.string.Login)
 */
@Deprecated("Supporting different local need to provide activity context instead of application context", ReplaceWith("arrayOfStrings(resourcesID)"))
fun arrayOfStrings(vararg resourcesID: Int): List<String> {
    val stringsArray = ArrayList<String>()
    resourcesID.forEach {
        @Suppress("DEPRECATION")
        stringsArray.add(stringer(it))
    }
    return stringsArray
}

fun arrayOfStrings(vararg resourcesID: Int, context: Context): List<String> {
    val stringsArray = ArrayList<String>()
    resourcesID.forEach {
        stringsArray.add(stringify(it, context))
    }
    return stringsArray
}

fun arrayOfColor(vararg colorsID: Int): List<Int> {
    val colorsArray = ArrayList<Int>(colorsID.size)
    colorsID.forEach {
        colorsArray.add(colorOf(it))
    }
    return colorsArray
}



