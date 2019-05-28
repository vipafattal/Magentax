package com.codebox.lib.standard.collections

fun <T> Collection<T>.ListSizeData(): Pair<Collection<T>, Int> = Pair(this, size)