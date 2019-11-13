package com.abed.magentaX.standard.collections.filters

fun <T>ArrayList<T>.addWhile(predicate:(T) -> Boolean){
    this.filter(predicate)
    for (element in this)
    if (predicate(element)){
        this.add(element)
    }
}