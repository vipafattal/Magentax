package com.codebox.lib.android.resoures

import android.content.Context
import android.content.res.Resources
import androidx.core.content.ContextCompat
import com.codebox.lib.android.os.MagentaX.appContext

val appResources: Resources = appContext.resources


fun Colour(colorID: Int, context: Context = appContext): Int = ContextCompat.getColor(context, colorID)

@Deprecated("Supporting different local need to provide activity context instead of application context", ReplaceWith("Stringify(stringID)"))
fun Stringer(stringID: Int, mContext: Context = appContext) = mContext.resources.getString(stringID)

fun Stringify(stringID: Int, mContext: Context) = mContext.resources.getString(stringID)


fun Image(drawableImg: Int, context: Context = appContext) = ContextCompat.getDrawable(context, drawableImg)
/**
 * @resourcesID is string resources
 *  arrayOfStrings(R.string.appName,R.string.Welcome,R.string.Login)
 */
@Deprecated("Supporting different local need to provide activity context instead of application context", ReplaceWith("arrayOfStrings(resourcesID)"))
fun arrayOfStrings(vararg resourcesID: Int): List<String> {
    val stringsArray = ArrayList<String>()
    resourcesID.forEach {
        @Suppress("DEPRECATION")
        stringsArray.add(Stringer(it))
    }
    return stringsArray
}

fun arrayOfStrings(vararg resourcesID: Int, context: Context): List<String> {
    val stringsArray = ArrayList<String>()
    resourcesID.forEach {
        stringsArray.add(Stringify(it, context))
    }
    return stringsArray
}

fun arrayOfColor(vararg colorsID: Int): List<Int> {
    val colorsArray = ArrayList<Int>(colorsID.size)
    colorsID.forEach {
        colorsArray.add(Colour(it))
    }
    return colorsArray
}



