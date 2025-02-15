package com.example.kotlinmasterclass.section3

fun main() {
    constructorExample1()
    constructorExample2()
    constructorExample3()
    constructorExample4()
}

fun constructorExample1() {
    val person = PersonConstructor("Alberta")
    person.getName()
}

fun constructorExample2() {
    val person = PersonConstructor1("Alberto")
    person.getName()
}

fun constructorExample3() {
    val person = PersonConstructor1()
    person.getName()
}

fun constructorExample4() {
    val person = PersonConstructor1(name = "Liam Jonah")
    println(person.toString())
}

class PersonConstructor(name: String) {
    val myName = name

    fun getName() {
        println(myName)
    }
}

class PersonConstructor1(val name: String = "Unknown") {
    fun getName() {
        println(name)
    }

    override fun toString(): String {
        return name
    }
}

class PersonConstructor2(val name: String) {
    fun getName() {
        println(name)
    }

    override fun toString(): String {
        return name
    }
}