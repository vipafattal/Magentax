package com.abed.magentaX.android.utils

import android.os.Build
import com.abed.magentaX.standard.lambda.unitFun


inline fun sdkSupport(sdk: Int, codeBlock: unitFun) {
    if (Build.VERSION.SDK_INT >= sdk)
        codeBlock()
}
inline fun sdkSupport(sdk: Int, codeBlock: unitFun, orElse:unitFun) {
    if (Build.VERSION.SDK_INT >= sdk) 
        codeBlock()
    else
        orElse()
}