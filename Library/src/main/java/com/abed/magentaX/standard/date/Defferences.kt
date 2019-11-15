package com.abed.magentaX.standard.date

import java.util.*
import java.util.concurrent.TimeUnit

infix fun Date.deferenceInDays(subtract: Date): Int {
    val diffInMillies = this.time - subtract.time
    return TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS).toInt()
}

infix fun Date.deferenceInHours(subtract: Date): Int {
    val diffInMillies = this.time - subtract.time
    return TimeUnit.HOURS.convert(diffInMillies, TimeUnit.MILLISECONDS).toInt()
}

infix fun Date.deferenceInMin(subtract: Date): Int {
    val diffInMillies = this.time - subtract.time
    return TimeUnit.MINUTES.convert(diffInMillies, TimeUnit.MILLISECONDS).toInt()
}