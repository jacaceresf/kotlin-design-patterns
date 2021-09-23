package dev.jacaceresf.designpatterns.chapter1

data class PC(
    val motherboard: String = "Some motherboard",
    val cpu: String = "CPU",
    val ram: String = "8GB",
    val graphicCard: String = "Some graphic"
)

fun main() {

    ///creates a new instance of a PC
    val pc = PC()

    //but the whole idea behind the prototype pattern is to clone an object easily
    //Kotlin implements object clone by the copy() method.

    val customPc = pc.copy(
        graphicCard = "Another graphic card",
        ram = "Much more ram"
    )

    println(customPc)
}