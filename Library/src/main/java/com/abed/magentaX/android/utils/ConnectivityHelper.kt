package com.abed.magentaX.android.utils

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import androidx.annotation.IntRange
import androidx.annotation.RequiresPermission
import com.abed.magentaX.android.MagentaX


object ConnectivityHelper {

    @RequiresPermission(android.Manifest.permission.ACCESS_NETWORK_STATE)
    fun isConnectedToNetwork(): Boolean = getConnectionType() != 0


    //https://stackoverflow.com/a/53243938/6470661
    @IntRange(from = 0, to = 2)
    @RequiresPermission(android.Manifest.permission.ACCESS_NETWORK_STATE)
    fun getConnectionType(): Int {
        var result = 0
        (MagentaX.application.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager?)?.run {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                getNetworkCapabilities(activeNetwork)?.run {
                    result = when {
                        hasTransport(NetworkCapabilities.TRANSPORT_WIFI) -> 2
                        hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) -> 1
                        else -> 0
                    }
                }

            } else {
                @Suppress("DEPRECATION")
                result = when (activeNetworkInfo?.type) {
                    ConnectivityManager.TYPE_WIFI -> 2
                    ConnectivityManager.TYPE_MOBILE -> 1
                    else -> 0
                }
            }
        }
        return result
    }
}