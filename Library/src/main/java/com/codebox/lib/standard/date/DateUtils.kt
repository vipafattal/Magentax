package com.codebox.lib.standard.date

import java.text.SimpleDateFormat
import java.util.*

/**
 * kk means hours in 24 system
 * this fun return time in the form [hours,min]
 * so to get hours
 * define a variable getTimeArray(date)[0] "hours"  getTimeArray(date)[1] "min"
 * for example:
val currentTime = getTimeArray(Date())
val currentHor = currentTime[0]
val currentMin = currentTime[1]
 */
fun getTimeArray(date: Date): List<Int> {

    val dateFormatter = SimpleDateFormat("kk:mm", Locale.getDefault())

    val dateStr = dateFormatter.format(date)
    val timeInString: List<String> = dateStr.split(":")
    val intArray = ArrayList<Int>()
    timeInString.forEach {
        intArray.add(Integer.parseInt(it))
    }
    return intArray
}

fun Date.getDays(): Int {
    val cal = Calendar.getInstance()
    cal.time = this
    return cal.get(Calendar.DAY_OF_MONTH)
}

fun Date.getMinutes(): Int {
    val cal = Calendar.getInstance()
    cal.time = this
    return cal.get(Calendar.MINUTE)
}

fun Date.getHours(): Int {
    val cal = Calendar.getInstance()
    cal.time = this
    return cal.get(Calendar.HOUR_OF_DAY)
}
