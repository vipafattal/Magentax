package com.codebox.lib.standard.date

import java.util.*
import java.util.concurrent.TimeUnit

infix fun Date.defInDays(subtract: Date): Int {
    val diffInMillies = this.time - subtract.time
    return TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS).toInt()
}

infix fun Date.defInHours(subtract: Date): Int {
    val diffInMillies = this.time - subtract.time
    return TimeUnit.HOURS.convert(diffInMillies, TimeUnit.MILLISECONDS).toInt()
}

infix fun Date.defInMin(subtract: Date): Int {
    val diffInMillies = this.time - subtract.time
    return TimeUnit.MINUTES.convert(diffInMillies, TimeUnit.MILLISECONDS).toInt()
}