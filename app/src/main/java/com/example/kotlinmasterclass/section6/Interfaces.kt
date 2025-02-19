package com.example.kotlinmasterclass.section6

fun main() {
    interfaceExample1()
    interfaceExample2()
}

fun interfaceExample1() {
    val dog = InterfaceDog(color2 = "White")
    val cat = InterfaceCat()
}

fun interfaceExample2() {
    val male = InterfaceMale()
    male.eyeColor()

    val male2 = InterfacePerson { "Yellow" }
}

interface AnimalInterface {
    val legs: Int
    val color: String get() = "Black"
    val color2: String
    fun speak(): String
    fun walk(): Int {
        var steps = 0

        for (step in 0..20 step 2) {
            steps += step
        }

        return steps
    }
}

class InterfaceDog(override val color2: String) : AnimalInterface {
    override val legs = 4
    override fun speak() = "Wof!"

    override fun walk(): Int {
        return super.walk()
    }
}

class InterfaceCat: AnimalInterface {
    override val legs = 4
    override fun speak() = "Meow!"
    override val color2 = "Green"
}

fun interface InterfacePerson {
    fun eyeColor(): String
    fun hairColor(): String = "Male"
}

class InterfaceMale: InterfacePerson {
    override fun eyeColor() = "Black"
}