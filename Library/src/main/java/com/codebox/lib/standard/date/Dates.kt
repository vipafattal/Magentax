package com.codebox.lib.standard.date

import java.text.SimpleDateFormat
import java.util.*

fun dateWithoutHours(date: Date = Date()): Date {
    val formatter = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
    val localDeviceDate = formatter.format(date)

    return formatter.parse(localDeviceDate)
}

fun stringDate(date: Date = Date()): String {
    val formatter = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
    return formatter.format(date)
}

fun stringDateWithMin(date: Date = Date()): String {
    val formatter = SimpleDateFormat("yyyy-MM-dd:hh,mm", Locale.getDefault())
    return formatter.format(date)
}