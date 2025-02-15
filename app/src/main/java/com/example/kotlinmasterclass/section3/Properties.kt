package com.example.kotlinmasterclass.section3

fun main() {
    propertyExample1()
    propertyExample2()
    propertyExample3()
}

fun propertyExample1() {
    val person = Person()

    println(person.personAge)
    person.setAge(age = 8)
    println(person.personAge)
}

fun propertyExample2() {
    val person = Person()

    println(person.personAge)
    person.setAge(age = 24)
    println(person.personAge)
}

fun propertyExample3() {
    val person1 = Person()
    val person2 = person1

    println(person1.personAge)
    println(person2.personAge)
    person1.setAge(age = 30)
    println(person1.personAge)
    println(person2.personAge)
    println(person1)
    println(person2)
}

class Person {
    var personAge = 0

    fun setAge(age: Int) {
        personAge = age
    }
}