package com.codebox.lib.standard.collections.filters

fun <T>MutableList<T>.mFilter(predicate:(T)->Boolean): MutableList<T> {
    return filterTo(this, predicate)
}