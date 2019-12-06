package com.abed.magentaX.android.utils.screenHelpers

import android.content.res.Configuration
import com.abed.magentaX.android.os.MagentaX.application
import com.abed.magentaX.android.resoures.appResources
import org.jetbrains.anko.ScreenSize
import org.jetbrains.anko.ScreenSize.*

fun isScreenTablet(): Boolean =
        application.resources.configuration.screenLayout and Configuration.SCREENLAYOUT_SIZE_MASK >= Configuration.SCREENLAYOUT_SIZE_LARGE


private fun getScreenSize(): ScreenSize {
    var screenLayout = appResources.configuration.screenLayout
    screenLayout = screenLayout and Configuration.SCREENLAYOUT_SIZE_MASK

    return when (screenLayout) {
        Configuration.SCREENLAYOUT_SIZE_SMALL -> SMALL
        Configuration.SCREENLAYOUT_SIZE_NORMAL -> NORMAL
        Configuration.SCREENLAYOUT_SIZE_LARGE -> LARGE
    // Configuration.SCREENLAYOUT_SIZE_XLARGE is API >= 9
        Configuration.SCREENLAYOUT_SIZE_XLARGE -> XLARGE
        else -> throw Exception("Unknown Screen Size")
    }
}