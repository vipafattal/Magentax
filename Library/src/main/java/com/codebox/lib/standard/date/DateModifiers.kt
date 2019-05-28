package com.codebox.lib.standard.date

import java.util.*
import java.util.Calendar.*


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