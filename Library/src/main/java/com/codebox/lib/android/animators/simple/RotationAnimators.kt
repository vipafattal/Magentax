package com.codebox.lib.android.animators.simple

import android.animation.ValueAnimator
import android.view.View
import android.view.animation.Animation
import com.codebox.lib.android.animators.Interval
import com.codebox.lib.extrenalLib.doOnEnd
import com.codebox.lib.standard.lambda.unitFun


fun View.rotationAnimators(startAngle: Float = 0f, endAngle: Float = 360f): ValueAnimator {
    return rotation(startAngle, endAngle, 1500)
}

fun View.rotationAnimators(doOnEnd: unitFun): ValueAnimator =
        rotation(0f, 360f, 1500).apply {
            doOnEnd {
                doOnEnd.invoke()
            }
        }


fun View.rotationAnimators(startAngle: Float, endAngle: Float, interval: Interval): ValueAnimator =
        rotation(startAngle, endAngle, interval)


inline fun View.rotationAnimators(startAngle: Float, endAngle: Float, interval: Interval, crossinline doOnEnd: unitFun): ValueAnimator =

        rotation(startAngle, endAngle, interval).apply {
            doOnEnd {
                doOnEnd.invoke()
            }
        }

@PublishedApi
internal fun View.rotation(startAngle: Float, endAngle: Float, interval: Interval): ValueAnimator =
        ValueAnimator().apply {
            setFloatValues(startAngle, endAngle)
            duration = interval
            repeatCount = Animation.INFINITE
            repeatMode = ValueAnimator.REVERSE
            start()
            addUpdateListener {
                rotation = it.animatedValue as Float
            }
        }
