package com.codebox.lib.standard.date

import java.util.*

fun getMonthName(month: Int): String {
    val monthNames = arrayOf("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December")
    return monthNames[month]
}

fun Date.getMonthName(): String {
    val getNumber = getMonthNumber()
    val monthNames = arrayOf("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December")
    return monthNames[getNumber]
}

fun Date.getMonthNumber(): Int {
    val cal = Calendar.getInstance()
    cal.time = this
    return cal.get(Calendar.MONTH)
}

fun Date.getMonthFromBeginning(): Date {
    val cal = Calendar.getInstance()
    cal.time = this
    cal.add(Calendar.MONTH, 0)
    cal.set(Calendar.DAY_OF_MONTH, 1)
    return cal.time
}

fun Date.getPreviousMonth(): Date {
    val cal = Calendar.getInstance()
    cal.time = this
    cal.add(Calendar.MONTH, -1)
    cal.set(Calendar.DAY_OF_MONTH, 1)
    return cal.time
}

fun Date.getLastDayInMonth(): Int {
    val cal = Calendar.getInstance()
    cal.time = this
    cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH))

    return getDays()
}