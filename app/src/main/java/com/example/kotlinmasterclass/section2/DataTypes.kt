package com.example.kotlinmasterclass.section2

fun main() {
    example21()
    println("--------------------")
    example22()
    println("--------------------")
    example23()
    println("--------------------")
    example24()
    println("--------------------")
}

fun example21() {
    // byte, short, int, long
    // float, double

    val number = 5
    val doubleNumber = 4.99
    val floatNumber = 4.99f
    val letter = 'A'
    val boolean = true
    val text = "Some random text"
}

fun example22() {
    // Cannot change the type after declared
    var text = "Some random text"
    // text = 1
}

fun example23() {
    var text = "5"
    val numberFromString = Integer.parseInt(text)
    println(numberFromString)
}

fun example24() {
    var example = 1 + 1.5 // Kotlin is smart enough to determine the type to Double
    val example2 = "Number" + 1.25 // Kotlin is smart enough to determine the type to String
    // val example3 = true + false
    // val example4 = 5 + 'a'
    println(example2)
}