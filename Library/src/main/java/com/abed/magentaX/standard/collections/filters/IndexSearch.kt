package com.abed.magentaX.standard.collections.filters

fun <T> Iterable<T>.itemIndex(predicate: (T) -> Boolean): Int {
    var index = 0
    for (element in this) {
        if (predicate(element))
            return index
        index++
    }
    throw NoSuchElementException("Collection contains no element matching the predicate.")
}
fun <T> Iterable<T>.itemIndexOrNull(predicate: (T) -> Boolean): Int? {
    var index = 0
    for (element in this) {
        if (predicate(element))
            return index
        index++
    }
    return null
}
