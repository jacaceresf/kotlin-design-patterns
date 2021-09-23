package dev.jacaceresf.designpatterns.reactivechapter

import io.reactivex.Observable
import java.time.LocalDateTime
import java.util.concurrent.TimeUnit

fun main() {

    val publisher = Observable.fromArray(5, 6, 7)

    ///we can supply a lambda to the publisher to start consuming those numbers
    publisher.subscribe {
        println("Got number -> [$it]")
    }

    val intervalPublisher = Observable.interval(1, TimeUnit.SECONDS)

    intervalPublisher.subscribe {
        println("Publisher 1 -> $it - ${LocalDateTime.now()}")
    }

    intervalPublisher.subscribe {
        println("Publisher 2 -> $it - ${LocalDateTime.now()}")
    }

    ///due to the asynchronicity, this line will be printed before any of the publishers
    println("Sleeping")
    Thread.sleep(TimeUnit.SECONDS.toMillis(5))

}