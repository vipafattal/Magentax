package com.abed.magentaX.android.actvity

import android.app.Activity
import android.view.inputmethod.InputMethodManager
import androidx.annotation.IdRes
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import com.abed.magentaX.android.fragments.transaction

val AppCompatActivity.transaction
    get() = supportFragmentManager.beginTransaction()


fun AppCompatActivity.replaceFragment(fragment: Fragment, @IdRes viewID: Int, tag: String? = null) {
    supportFragmentManager.transaction {
        replace(viewID, fragment, tag)
    }
}

fun AppCompatActivity.showDialog(dialogFragment: DialogFragment, tag: String) {
    dialogFragment.show(this.supportFragmentManager, tag)
}

fun Activity.hideKeyboard() {
    val inputMethodManager = getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
    inputMethodManager.hideSoftInputFromWindow(window.decorView.rootView.windowToken, 0)
}


