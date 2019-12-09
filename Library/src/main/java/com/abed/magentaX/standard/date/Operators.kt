package com.abed.magentaX.standard.date

import java.util.*

operator fun Date.plus(date: Date): Date = dateOperation(this, date, +1)
operator fun Date.minus(date: Date): Date = dateOperation(this, date, -1)

/** @param processType:
 * sum pass:1
 * minus pass:-1
 */
private fun dateOperation(date1: Date, date2: Date, processType: Int): Date {
    require(processType == -1 || processType == 1) { "you should pass for processType 1 or -1" }
    val c1 = Calendar.getInstance()
    val c2: Calendar = Calendar.getInstance()

    c1.time = date1
    c2.time = date2

    //making new instance with same c1 variable values at the first
    return (c1.clone() as Calendar).apply {
        add(Calendar.YEAR, c2.get(Calendar.YEAR))
        add(Calendar.MONTH, c2.get(Calendar.MONTH) + 1 * processType) // months are zero-based!
        add(Calendar.DATE, c2.get(Calendar.DATE) * processType)
        add(Calendar.HOUR_OF_DAY, c2.get(Calendar.HOUR_OF_DAY) * processType)
        add(Calendar.MINUTE, c2.get(Calendar.MINUTE) * processType)
        add(Calendar.SECOND, c2.get(Calendar.SECOND) * processType)
        add(Calendar.MILLISECOND, c2.get(Calendar.MILLISECOND) * processType)
    }.time
}