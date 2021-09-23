package dev.jacaceresf.designpatterns.idiomatic

///RUN it is like the apply but it sets the context on THIS.
///it is useful when we want to call a number of methods on the same object

fun main() {

    val aString = "string"

    val stringLen = aString.run { this.length } ///we can omit the THIS

    println("-> $stringLen")

    ///it returns the result of the last execution
    val lastResultOfRun = aString.run {
        length
        contains("x")
        substring(1..4)
    }

    println("Last result value is -> [$lastResultOfRun] of type [${lastResultOfRun.javaClass}]")
}