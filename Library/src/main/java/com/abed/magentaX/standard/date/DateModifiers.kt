package com.abed.magentaX.standard.date

import java.util.*
import java.util.Calendar.*

fun subtractDays(days: Int, dateToSubtract: Date = Date()): Date {
    val dateWithoutHours = dateWithoutHours(dateToSubtract)
    dateWithoutHours.time = dateWithoutHours.time - days * 1000 * 60 * 60 * 24
    return dateWithoutHours
}

infix fun Date.months(numbersOfMonths: Int): Date =
        getInstance().apply {
            time = this@months
            add(MONTH, numbersOfMonths)
        }.time

infix fun Date.days(days: Int): Date =

        getInstance().apply {
            time = this@days
            add(DATE, days)
        }.time


infix fun Date.hours(hours: Int): Date =
        getInstance().apply {
            time = this@hours
            add(HOUR_OF_DAY, hours)
        }.time


infix fun Date.minutes(min: Int): Date =
        getInstance().apply {
            time = this@minutes
            add(MINUTE, min)
        }.time