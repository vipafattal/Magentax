package com.abed.magentaX.android.widgets.snackbar

import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.abed.magentaX.R
import com.abed.magentaX.standard.lambda.unitFun
import com.google.android.material.snackbar.Snackbar

/**
 *invoking snackbar from activity without any Lambda Exception
 */


fun View.snackbar(
        msg: String,
        duration: Int = Snackbar.LENGTH_LONG,
        textColor: Int? = R.color.white
): Snackbar {

    val sn = Snackbar.make(this, msg, duration)
    sn.show()

    if (textColor != null) {
        sn.setSnackbarTextColor(textColor)
    }

    return sn
}
fun AppCompatActivity.snackbar(
        msg: String,
        duration: Int = Snackbar.LENGTH_LONG,
        textColor: Int? = R.color.white,
        v: View = findViewById(android.R.id.content)
): Snackbar {

    val sn = Snackbar.make(v, msg, duration)
    sn.show()

    if (textColor != null) {
        sn.setSnackbarTextColor(textColor)
    }

    return sn
}

/**
 *invoking snackbar from activity with Lambda Exception
 */
inline fun AppCompatActivity.snackbar(
        msg: String,
        v: View = findViewById(android.R.id.content),
        duration: Int = Snackbar.LENGTH_INDEFINITE,
        textColor: Int? = null,
        crossinline block: unitFun): Snackbar =

        Snackbar.make(v, msg, duration).apply {
            show()

            if (textColor != null) {
                setSnackbarTextColor(textColor)
            }

            setAction(msg) {
                block.invoke()
            }
        }


