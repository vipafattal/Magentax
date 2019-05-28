package com.codebox.lib.android.os

import android.os.Handler

/**
 * Created by Abed on 2/23/2018.
 */
/**
 * for crossinline visit (and read answer 2):
 * https://android.jlelse.eu/inline-noinline-crossinline-what-do-they-mean-b13f48e113c2
 *Lambda is passed to another execution context such as a higher order function that is not inlined
 *https://stackoverflow.com/questions/38827186/what-is-the-difference-between-crossinline-and-noinline-in-kotlin
 **/

val appHandler by lazy { Handler() }

inline fun Handler.wait(timer: Long, crossinline block: () -> Unit) {
    this.postDelayed({
        //execution in another context (function)
        block()
    }, timer)
}