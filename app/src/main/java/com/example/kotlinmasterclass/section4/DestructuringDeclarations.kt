package com.example.kotlinmasterclass.section4

fun main() {
    destructuringExample1()
    destructuringExample2()
    destructuringExample3()
    destructuringExample4()
    destructuringExample5()
}

fun destructuringExample1() {
    val pair = Pair(first = 1, second = "Alberta")
    println(pair.first)
    println(pair.second)

    val (id, name) = pair
    println(id)
    println(name)
}

fun destructuringExample2() {
    val person = DestructuringDeclarations(name = "Alberta", age = 35, address = "Getafe Bohol")
    val (name, age, address) = person

    println(name)
    println(age)
    println(address)
}

fun destructuringExample3() {
    val person = DestructuringDeclarations(name = "Alberta", age = 35, address = "Getafe Bohol")
    val (_, age, _) = person

    println(age)
}

fun destructuringExample4() {
    val person = DestructuringDeclarations(name = "Alberta", age = 35, address = "Getafe Bohol")
    val (_, age) = person

    println(age)
}

fun destructuringExample5() {
    val map = mapOf(1 to "One")
//    val (number, text) = map

    for ((number, text) in map) {
        println(number)
        println(text)
    }
}

data class DestructuringDeclarations(
    val name: String,
    val age: Int,
    val address: String
)