package com.codebox.lib.android.animators.motion

import android.animation.ValueAnimator
import android.view.View
import android.view.animation.Interpolator
import android.view.animation.LinearInterpolator
import com.codebox.lib.android.animators.Interval
import com.codebox.lib.extrenalLib.doOnEnd
import com.codebox.lib.standard.lambda.unitFun

/**
 * Created by Abed on 3/1/2018.
 */


inline fun View.motionXAnimator(valueFrom: Float, valueTo: Float, time: Interval, interpolator: Interpolator = LinearInterpolator(), crossinline doOnEnd: unitFun): ValueAnimator =
        motion(valueFrom, valueTo, time, interpolator).apply {
            addUpdateListener {
                x = it.animatedValue as Float
            }
            doOnEnd {
                doOnEnd.invoke()
            }

        }

fun View.motionXAnimator(valueFrom: Float, valueTo: Float, time: Interval, interpolator: Interpolator = LinearInterpolator()): ValueAnimator =
        motion(valueFrom, valueTo, time, interpolator).apply {
            addUpdateListener {
                x = it.animatedValue as Float
            }
        }