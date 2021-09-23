package dev.jacaceresf.designpatterns.idiomatic

/// we can use ALSO to make something more than the operation in a single expression function
fun multiply(a: Int, b: Int): Int = (a * b).also { println(it) } ///it will print the result

fun main() {

    multiply(3, 4)

    ///it is also useful when we want to have a side effect on a chain of calls
    val list = (1..100).toList()

    list.filter { it % 2 == 0 }
        .also { println(it) } ///doesn't change anything
        .map { it * it }
}