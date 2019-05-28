package com.codebox.lib.android.utils

import android.content.Context
import android.content.SharedPreferences
import com.codebox.lib.android.os.MagentaX.appContext
import com.codebox.lib.extrenalLib.edit


/**
 * Created by Abed on 12/14/2017.
 */
class AppPreferences {

    companion object {
        internal var defaultPrefsFileName:String = "AppPreferences"

        fun getInstance(sharedPreferencesFileName: String): AppPreferences {
            val appPreferences = AppPreferences()
            appPreferences.fileName = sharedPreferencesFileName
            return appPreferences
        }
    }

    private var fileName = defaultPrefsFileName
    private val mPref: SharedPreferences by lazy { appContext.getSharedPreferences(fileName, Context.MODE_PRIVATE) }

    fun getDouble(key: String, defValue: Double = 0.0): Double {
        return mPref.getString(key, defValue.toString())!!.toDouble()
    }

    fun getInt(key: String, defValue: Int = 0): Int {
        return mPref.getInt(key, defValue)
    }

    fun getLong(key: String, defValue: Long = 0): Long {
        return mPref.getLong(key, defValue)
    }

    fun getBoolean(key: String, defValue: Boolean = false): Boolean {
        return mPref.getBoolean(key, defValue)
    }

    fun getStr(key: String, defValue: String = "No data"): String {
        return mPref.getString(key, defValue)!!
    }

    fun put(key: String, `val`: String) {

        mPref.edit {
            putString(key, `val`)
        }
    }


    fun put(key: String, `val`: Int) {
        mPref.edit {
            putInt(key, `val`)
        }
    }

    fun put(key: String, `val`: Long) {
        mPref.edit {
            putLong(key, `val`)
        }
    }


    fun put(key: String, `val`: Boolean) {
        mPref.edit {
            putBoolean(key, `val`)
        }

    }


    fun put(key: String, `val`: Float) {
        mPref.edit {
            putFloat(key, `val`)
        }
    }

    /**
     *
     * Convenience method for storing doubles.
     *
     *
     *
     * There may be instances where the accuracy of a double is desired.
     *
     * SharedPreferences does not handle doubles so they have to
     *
     * cast to and from String.
     *
     *
     *
     * @param key The name of the preference to store.
     *
     * @param val The new value for the preference.
     */

    fun put(key: String, `val`: Double) {
        mPref.edit {
            putString(key, `val`.toString())
        }
    }

    fun remove(key: Int) {
        mPref.edit {
            remove(key.toString())
        }
    }

    /**
     *
     * Remove all keys from SharedPreferences.
     *
     */
    fun clear() {
        mPref.edit {
            clear()
        }
    }
}

