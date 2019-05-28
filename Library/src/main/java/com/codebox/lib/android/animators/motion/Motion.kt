package com.codebox.lib.android.animators.motion

import android.animation.ValueAnimator
import android.view.animation.Interpolator
import com.codebox.lib.android.animators.Interval

@PublishedApi
internal fun motion(valueFrom: Float, valueTo: Float, time: Interval, interpolator: Interpolator): ValueAnimator =
        ValueAnimator().apply {
            this.duration = time
            this.interpolator = interpolator
            setFloatValues(valueFrom, valueTo)
            setTarget(this)
            start()
        }