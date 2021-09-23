package dev.jacaceresf.designpatterns.idiomatic

class Person {
    lateinit var name: String
    lateinit var address: String
    lateinit var phoneNumber: String

}

fun main() {
    ///we use APPLY when we want to create an instance of a mutable object.
    /// it puts the context on THIS, so we can apply some kind of builder pattern.

    val me = Person().apply {
        name = "George"
        phoneNumber = "1231231"
    }

    val anotherPerson = Person().apply {
        name = "Unknown"
    }

    println(me)
    println(anotherPerson)
}