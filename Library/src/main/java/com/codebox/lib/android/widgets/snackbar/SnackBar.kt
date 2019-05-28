package com.codebox.lib.android.widgets.snackbar

import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.codebox.lib.R
import com.codebox.lib.standard.lambda.unitFun
import com.google.android.material.snackbar.Snackbar

/**
 *invoking snackbar from activity without any Lambda Exception
 */


fun AppCompatActivity.snackbar(
        msg: String,
        duration: Int = com.google.android.material.snackbar.Snackbar.LENGTH_LONG,
        textColor: Int? = R.color.white,
        v: View = findViewById(android.R.id.content)
): Snackbar {

    val sn = com.google.android.material.snackbar.Snackbar.make(v, msg, duration)
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
        duration: Int = com.google.android.material.snackbar.Snackbar.LENGTH_INDEFINITE,
        textColor: Int? = null,
        crossinline block: unitFun): Snackbar =

        com.google.android.material.snackbar.Snackbar.make(v, msg, duration).apply {
            show()

            if (textColor != null) {
                setSnackbarTextColor(textColor)
            }

            setAction(msg) {
                block.invoke()
            }
        }


