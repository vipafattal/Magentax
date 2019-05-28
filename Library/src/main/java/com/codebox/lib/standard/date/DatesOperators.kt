package com.codebox.lib.standard.date

import java.util.*

operator fun Date.plus(date: Date): Date = dateOperation(this, date, +1)

operator fun Date.minus(date: Date): Date = dateOperation(this, date, -1)

/** @param type:
 * sum pass:1
 * minus pass:-1
 */
private fun dateOperation(date1: Date, date2: Date, type: Int): Date {
    require(type == -1 || type == 1) { "you should pass for type 1 or -1" }
    val c1 = Calendar.getInstance()
    val c2: Calendar = Calendar.getInstance()

    c1.time = date1
    c2.time = date2

    //making new instance with same c1 variable values at the first
    return (c1.clone() as Calendar).apply {
        add(Calendar.YEAR, c2.get(Calendar.YEAR))
        add(Calendar.MONTH, c2.get(Calendar.MONTH) + 1 * type) // months are zero-based!
        add(Calendar.DATE, c2.get(Calendar.DATE) * type)
        add(Calendar.HOUR_OF_DAY, c2.get(Calendar.HOUR_OF_DAY) * type)
        add(Calendar.MINUTE, c2.get(Calendar.MINUTE) * type)
        add(Calendar.SECOND, c2.get(Calendar.SECOND) * type)
        add(Calendar.MILLISECOND, c2.get(Calendar.MILLISECOND) * type)
    }.time
}