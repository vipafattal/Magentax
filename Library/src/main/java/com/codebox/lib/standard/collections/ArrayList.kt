package com.codebox.lib.standard.collections

/**
 * Created by Abed on 2/10/2018.
 */

val <T> Collection<T>.lastIndex: Int
    get() = size - 1

fun <T> Collection<T>.isLastItem(index: Int): Boolean =
        if (isNotEmpty())
            index == lastIndex
        else throw IllegalArgumentException("You passed empty array")

fun <T> MutableList<T>.swap(index1: Int, index2: Int) {
    val tmp = this[index1] // 'this' corresponds to the list
    this[index1] = this[index2]
    this[index2] = tmp

}
