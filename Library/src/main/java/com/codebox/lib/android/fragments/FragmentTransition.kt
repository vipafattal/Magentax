package com.codebox.lib.android.fragments

import androidx.annotation.AnimRes
import androidx.annotation.AnimatorRes
import androidx.annotation.IdRes
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction


val AppCompatActivity.transaction
    get() = supportFragmentManager.beginTransaction()


fun AppCompatActivity.replaceFragment(fragment: Fragment, @IdRes viewID: Int, tag: String? = null) {
    supportFragmentManager.transaction {
        replace(viewID, fragment, tag)
    }
}

fun FragmentTransaction.animate(@AnimatorRes @AnimRes enter: Int = android.R.anim.fade_in,
                                @AnimatorRes @AnimRes exit: Int = android.R.anim.fade_out) =
        setCustomAnimations(enter, exit)


inline fun FragmentManager.transaction(
        commit: Boolean = true,
        animate: Boolean = true,
        action: FragmentTransaction.() -> FragmentTransaction
): FragmentTransaction {
    val transaction = beginTransaction()
    transaction.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out)
    if (animate)
        transaction.animate()
    if (commit)
        transaction.action().commit()
    else
        transaction.action()
    return transaction
}

