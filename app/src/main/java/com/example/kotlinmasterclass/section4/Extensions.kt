package com.example.kotlinmasterclass.section4

fun main() {
    extensionExample1()
    extensionExample2()
}

fun extensionExample1() {
    val name = "Alberta"
    println(name.fullName())
}

fun extensionExample2() {
    val person = PersonExtension(name = "Alberta Gwapita", age = 35, address = "San Jose, Getafe, Bohol")
    println(person.info())
    println(person.addressInfo())
}

fun String.fullName(): String {
    return "$this Gwapita"
}

class PersonExtension(
    private val name: String,
    private val age: Int,
    val address: String
) {
    fun info() = "My name is $name, and I'm $age years old!"
}

fun PersonExtension.addressInfo() = "Come visit me in $address"