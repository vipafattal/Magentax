package com.codebox.lib.android.animators.simple

import android.animation.ValueAnimator
import android.view.View
import com.codebox.lib.android.animators.Interval
import com.codebox.lib.android.animators.alpha
import com.codebox.lib.extrenalLib.doOnEnd

import com.codebox.lib.standard.lambda.unitFun

/**
 * Created by Abed on 2/28/2018.
 */

fun View.alphaAnimator(time: Interval = 1000, valueTo: alpha) {

    with(this.animate()) {
        alpha(valueTo)
        duration = time
        start()
    }

}

inline fun View.alphaAnimator(time: Interval = 1000, valueForm: alpha = this.alpha, valueTo: alpha, crossinline doOnEnd: unitFun) {

    val animator = ValueAnimator.ofFloat(valueForm, valueTo)
    animator.duration = time

    animator.addUpdateListener {
        this.alpha = animator.animatedValue as Float
    }
    animator.start()
    animator.doOnEnd {
        doOnEnd.invoke()
    }
}