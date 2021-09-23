package dev.jacaceresf.designpatterns.idiomatic

fun main() {

    ///usually we use LET to do something when an object is not null.

    val sometimesNull = if (java.util.Random().nextBoolean()) "not null" else null

    sometimesNull?.let {
        print("It was $it this time")
    }

    val alwaysNull = null
    alwaysNull.let {
        print("It is null")
    }
}