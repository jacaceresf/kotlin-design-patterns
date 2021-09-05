package dev.jacaceresf.designpatterns.chapter1


/**
 * A factory method is about two main points:
 *  -> Get some value
 *  -> Return of the object that implement some common interface
 */
interface Animal {
    val name: String
    val id: Int
}

open class Cat(override val id: Int) : Animal {
    override val name = "Cat"
}

class RussianBlue(override val id: Int) : Cat(id) {
    override val name = "Russian Blue"
}

open class Dog(override val id: Int) : Animal {
    override val name = "Dog"
}

class Beagle(override val id: Int) : Dog(id) {
    override val name = "Beagle"
}

class Bulldog(override val id: Int) : Dog(id) {
    override val name = "Bulldog"
}

class AnimalFactory {

    private var counter = 0
    private val dogFactory = DogFactory()
    private val catFactory = CatFactory()

    fun createAnimal(animalType: String, animalBreed: String): Animal {
        return when (animalType.trim().lowercase()) {
            "dog" -> dogFactory.createDog(animalBreed, ++counter)
            "cat" -> catFactory.createCat(animalBreed, ++counter)
            else -> throw RuntimeException("Unknown animal type -> $animalType")
        }
    }
}

class DogFactory {
    fun createDog(breed: String, id: Int) = when (breed.trim().lowercase()) {
        "bulldog" -> Bulldog(id)
        "beagle" -> Beagle(id)
        else -> throw RuntimeException("Unknown dog breed -> $breed")
    }
}

class CatFactory() {
    fun createCat(breed: String, id: Int) = when (breed.trim().lowercase()) {
        "russian blue" -> RussianBlue(id)
        else -> throw java.lang.RuntimeException("Unknown cat breed -> $breed")
    }
}

fun main() {

    val animalTypes = listOf(
        "dog" to "bulldog",
        "dog" to "beagle",
        "dog" to "beagle",
        "cat" to "russian blue"
    )

    val factory = AnimalFactory()

    ///destructuring declaration
    for ((type, breed) in animalTypes) {
        val c = factory.createAnimal(type, breed)
        println("${c.id} - ${c.name}")
    }
}