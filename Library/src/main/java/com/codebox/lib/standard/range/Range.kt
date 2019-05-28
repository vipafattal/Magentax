package com.codebox.lib.standard.range

/**
 * Created by ${User} on ${Date}
 */
val IntRange.asIndices: IntRange
    get() {
        val startPoint = start
        val endPoint = endInclusive - 1
        return startPoint..endPoint
    }