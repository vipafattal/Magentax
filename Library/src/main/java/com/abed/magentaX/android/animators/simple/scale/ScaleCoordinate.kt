package com.abed.magentaX.android.animators.simple.scale


import android.animation.ValueAnimator
import android.view.View
import android.view.animation.Animation
import com.abed.magentaX.android.animators.Interval
import com.abed.magentaX.extrenalLib.doOnEnd
import com.abed.magentaX.standard.lambda.unitFun

/**
 * Created by Abed on 2/28/2018.
 */
fun View.scaleXanimte(valueFrom: Float, valueTo: Float, time: Interval, repeatCount: Int = Animation.INFINITE): ValueAnimator = scale(valueFrom, valueTo, time, repeatCount, scaleOnX)

fun View.scaleYanimte(valueFrom: Float, valueTo: Float, time: Interval, repeatCount: Int = Animation.INFINITE): ValueAnimator = scale(valueFrom, valueTo, time, repeatCount, scaleOnY)


inline fun View.ScaleXanimte(valueFrom: Float, valueTo: Float, time: Interval, repeatCount: Int = Animation.INFINITE, crossinline doOnEnd: unitFun): ValueAnimator = scale(valueFrom, valueTo, time, repeatCount, scaleOnX).apply {

    doOnEnd {
        doOnEnd.invoke()
    }

}

inline fun View.scaleYanimte(valueFrom: Float, valueTo: Float, time: Interval, repeatCount: Int = Animation.INFINITE, crossinline doOnEnd: unitFun): ValueAnimator = scale(valueFrom, valueTo, time, repeatCount, scaleOnY).apply {

    doOnEnd {
        doOnEnd.invoke()
    }

}

