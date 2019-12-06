package com.abed.magentaX.android.fragments

import android.os.Build
import androidx.annotation.*
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.transition.TransitionInflater
import com.abed.magentaX.android.os.MagentaX


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

@RequiresApi(Build.VERSION_CODES.KITKAT)
fun Fragment.transitionAnimator(@TransitionRes enterRes: Int, @TransitionRes exitRes: Int) {
    val enterTransition = TransitionInflater.from(MagentaX.application)
            .inflateTransition(enterRes)
    val exitTransition = TransitionInflater.from(MagentaX.application)
            .inflateTransition(exitRes)

    sharedElementEnterTransition = enterTransition
    sharedElementReturnTransition = exitTransition
}

@RequiresApi(Build.VERSION_CODES.KITKAT)
fun Fragment.setEnterTrans(@TransitionRes enterRes: Int) {
    val enterTransition = TransitionInflater.from(MagentaX.application)
            .inflateTransition(enterRes)
    sharedElementEnterTransition = enterTransition
}

@RequiresApi(Build.VERSION_CODES.KITKAT)
fun Fragment.setExitTrans(@TransitionRes exitRes: Int) {
    val exitTransition = TransitionInflater.from(MagentaX.application)
            .inflateTransition(exitRes)

    sharedElementReturnTransition = exitTransition
}

