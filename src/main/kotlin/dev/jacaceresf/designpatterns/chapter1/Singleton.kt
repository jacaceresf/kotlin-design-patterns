package dev.jacaceresf.designpatterns.chapter1

import java.util.concurrent.atomic.AtomicInteger

/**
 * Kotlin introduces the keyword object that declares that this object is a SINGLETON
 *
 * Also, objects are lazy rather than eag
 *
 */
object MySingleton {

    private val counter = AtomicInteger(0)

    ///Objects can't have constructor, we use an INIT block instead.
    init {
        println("I was accessed for the first time!")
    }

    fun increment() = counter.incrementAndGet()
}


fun main() {
    val singletonObject = MySingleton
    for (i in 1..10) {
        println(singletonObject.increment())
    }
}