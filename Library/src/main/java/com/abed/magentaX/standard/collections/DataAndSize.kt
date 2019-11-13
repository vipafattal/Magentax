package com.abed.magentaX.standard.collections

fun <T> Collection<T>.ListSizeData(): Pair<Collection<T>, Int> = Pair(this, size)