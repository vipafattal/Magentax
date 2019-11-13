package com.abed.magentaX.android.widgets.snackbar

import com.abed.magentaX.libHelpers.getThemeAccentColor
import com.abed.magentaX.standard.lambda.unitFun
import com.google.android.material.snackbar.Snackbar

/**
 * show Action with snackbar with dismiss on action text clicked
 */
fun Snackbar.showAction(actionText: String = "Dismiss",
                        actionTextColor: Int? = null
) {
    setActionTextColor(actionTextColor ?: getThemeAccentColor(context))
    setAction(actionText) {
        dismiss()
    }
}

/**
 * show Action with snackbar with Lambda on action text clicked
 */
inline fun Snackbar.showAction(actionText: String = "Dismiss",
                               actionTextColor: Int? = null,
                               crossinline onActionClick: unitFun) {
    setActionTextColor(actionTextColor ?: getThemeAccentColor(context))
    setAction(actionText) {
        onActionClick.invoke()
    }
}
/*
we can write in one function but if we want to make nullable lambda we will get an error:
inline fun Snackbar.showAction(actionText: String = "Dismiss",
                               actionTextColor: Int? = null,
                               crossinline onActionClick: unitFun?) {
    setActionTextColor(actionTextColor ?: getThemeAccentColor(context))
    setAction(actionText) {
        onActionClick.invoke() ?: dismiss()
    }
}
 */