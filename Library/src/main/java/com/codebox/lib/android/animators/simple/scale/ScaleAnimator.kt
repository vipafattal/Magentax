package com.codebox.lib.android.animators.simple.scale

import android.animation.ValueAnimator
import android.view.View
import android.view.animation.Animation
import com.codebox.lib.android.animators.Interval
import com.codebox.lib.extrenalLib.doOnEnd
import com.codebox.lib.standard.lambda.unitFun

@PublishedApi internal const val scaleOnX = 0
@PublishedApi internal const val scaleOnY = 1


inline fun View.scaleAnimator(valueFrom: Float, valueTo: Float, time: Interval, repeatCount: Int = Animation.INFINITE, crossinline doOnEnd: unitFun): ValueAnimator = scale(valueFrom, valueTo, time, repeatCount).apply {
    doOnEnd {
        doOnEnd.invoke()
    }

}

fun View.scaleAnimator(valueFrom: Float, valueTo: Float, time: Interval, repeatCount: Int = Animation.INFINITE): ValueAnimator = scale(valueFrom, valueTo, time, repeatCount)


@PublishedApi
internal fun View.scale(valueFrom: Float, valueTo: Float, time: Interval, RepeatCount: Int, scaleType: Int = -1): ValueAnimator =
        ValueAnimator.ofFloat(valueFrom, valueTo).apply {
            duration = time
            repeatCount = RepeatCount
            repeatMode = ValueAnimator.REVERSE
            
            if (scaleType == -1)
                addUpdateListener {
                    scaleX = animatedValue as Float
                    scaleY = animatedValue as Float
                }
            else if (scaleType == 0)
                addUpdateListener {
                    scaleX = animatedValue as Float
                }
            else
                addUpdateListener {
                    scaleY = animatedValue as Float

                }
            start()
        }
