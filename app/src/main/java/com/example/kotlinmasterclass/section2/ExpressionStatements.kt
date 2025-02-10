package com.example.kotlinmasterclass.section2

fun main() {
    /**
     * Statements - does not produce any result
     * Statements - Change the state
     * Expression - Always produces a result
     */

    statements()
    println(expression(b = 5, a = 3))
}

fun statements() {
    var number = 0
    for (i in 1..10) {
        println(number)
        number++
    }
}

fun expression(a: Int, b: Int) = a + b

fun bigger(a: Int, b: Int) = if (a > b) a else b
fun unitFun() = Unit
fun unitFun2() {}