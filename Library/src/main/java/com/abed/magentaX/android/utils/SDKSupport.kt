package com.abed.magentaX.android.utils

import android.os.Build
import com.abed.magentaX.standard.lambda.unitFun


inline fun sdkSupport(SDKVersion: Int, codeBlock: unitFun) {
    if (Build.VERSION.SDK_INT >= SDKVersion) {
        codeBlock()
    }
}