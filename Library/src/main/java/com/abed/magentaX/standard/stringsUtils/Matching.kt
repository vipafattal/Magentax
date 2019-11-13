package com.abed.magentaX.standard.stringsUtils

fun String.match(words: String, caseSensitive: Boolean = true): Boolean =
        if (caseSensitive)
            matches("(.*)$words(.*)".toRegex())
        else
            matches("(?i:(.*)$words(.*))".toRegex())

