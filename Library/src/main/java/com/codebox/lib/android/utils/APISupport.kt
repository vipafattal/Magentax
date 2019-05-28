package com.codebox.lib.android.utils

import android.os.Build
import com.codebox.lib.standard.lambda.unitFun

/**
 * Created by Abed on 2/3/2018.
 */


inline fun sdkSupport(SDKVersion: Int, codeBlock: unitFun) {
    if (Build.VERSION.SDK_INT >= SDKVersion) {
        codeBlock()
    }
}