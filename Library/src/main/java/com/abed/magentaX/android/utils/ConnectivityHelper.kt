package com.abed.magentaX.android.utils

import android.content.Context
import android.net.ConnectivityManager
import androidx.annotation.RequiresPermission
import com.abed.magentaX.android.os.MagentaX

object ConnectivityHelper {

    @RequiresPermission(android.Manifest.permission.ACCESS_NETWORK_STATE)
    fun isConnectedToNetwork(): Boolean {
        val connectivityManager =
            MagentaX.application.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

        val isConnected: Boolean
        val activeNetwork = connectivityManager.activeNetworkInfo
        isConnected = activeNetwork != null && activeNetwork.isConnectedOrConnecting

        return isConnected
    }
}