package com.abed.magentaX.android.animators.simple

import android.animation.ValueAnimator
import android.view.View
import com.abed.magentaX.android.animators.Interval
import com.abed.magentaX.android.animators.alpha
import com.abed.magentaX.extrenalLib.doOnEnd

import com.abed.magentaX.standard.lambda.unitFun

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