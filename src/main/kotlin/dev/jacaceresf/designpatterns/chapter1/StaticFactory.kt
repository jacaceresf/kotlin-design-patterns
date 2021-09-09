package dev.jacaceresf.designpatterns.chapter1

///if we don't a method to belong to an instance of a class, we declared it as COMPANION OBJECT

class NumberMaster {
    companion object {
        fun valueOf(hopefullyNumber: String): Long {
            return hopefullyNumber.toLong()
        }
    }
}

private class MyClass private constructor() {
    companion object {
        fun create(): MyClass {
            return MyClass()
        }
    }
}

fun main() {

    println(NumberMaster.valueOf("213"))

    ///getting an instance by using the companion object
    val instance = MyClass.create()
}