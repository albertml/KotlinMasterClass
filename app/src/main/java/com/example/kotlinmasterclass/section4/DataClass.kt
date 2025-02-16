package com.example.kotlinmasterclass.section4

fun main() {
    dataClassExample1()
    dataClassExample2()
    dataClassExample3()
}

fun dataClassExample1() {
    val person = DataClassPerson(name = "Alberta Gwapita", age = 35)
    val person2 = DataClassPerson(name = "Alberta Gwapita", age = 35)

    println(person.equals(person2))
}

fun dataClassExample2() {
    val person = DataClassPerson(name = "Alberta Gwapita", age = 35)
    val person2 = person.copy(age = 18)

    println(person.equals(person2))
    println(person.toString())
    println(person2.toString())
}

fun dataClassExample3() {
    val person = DataClassPerson(name = "Alberta Gwapita", age = 35)

    val (name, age) = person
    println(name)
    println(age)
}

data class DataClassPerson(
    val name: String,
    val age: Int
)

data class DataClassPerson2(
    val name: String
) {
    var age: Int = 0
}