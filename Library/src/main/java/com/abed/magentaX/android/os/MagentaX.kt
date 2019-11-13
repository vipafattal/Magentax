package com.abed.magentaX.android.os

import android.content.Context
import com.abed.magentaX.android.utils.AppPreferences
import com.abed.magentaX.standard.delegation.DelegatesExt


object MagentaX {
    internal var appContext by DelegatesExt.notNullSingleValue<Context>()
        private set

    fun init(context: Context): MagentaX {
        appContext = context
        return this
    }

    fun setDefualtSharedPrefernceName(name: String): MagentaX {
        AppPreferences.defaultPrefsFileName = name
        return this
    }
}