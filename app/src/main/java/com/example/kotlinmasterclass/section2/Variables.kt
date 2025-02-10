package com.example.kotlinmasterclass.section2

/**
 * val - Immutable
 * var - Mutable
 * Suggest to declare val first all the time so its more clearer and safer to use
 */

fun main() {
    example1()
    println("--------------------")
    example2()
    println("--------------------")
    example3()
}
/**
 * Example 1
 */
fun example1() {
    var first = 1
    val second = 2
    first = 2
    println(first + second)
}

/**
 * Example 2
 */
fun example2() {
    var a = 10
    val b = a
    a = 20
    println(a)
    println(b)
}

/**
 * Example 3
 */
fun example3() {
    var a = 10
    var b = a
    a = 20
    b = a
    println(a)
    println(b)
}