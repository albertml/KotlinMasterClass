package com.example.kotlinmasterclass.section2

fun main() {
    helloWorld()
    sumOfTwoNumbers()
    println(sumOfTwoNumbers(5, 3))
    println(sumOfTwoNumbers2(5, 3))
    println(sumOfTwoNumbers3(5, 3))
}

fun helloWorld() {
    println("Hello World")
}

// Unit - is just like Void in Swift or no return
fun sumOfTwoNumbers(): Unit {
    println(2 + 2)
}

fun sumOfTwoNumbers(a: Int, b: Int): Int {
    return a + b
}

fun sumOfTwoNumbers2(a: Int, b: Int): Int = a + b
fun sumOfTwoNumbers3(a: Int, b: Int) = a + b

/*
fun - fun

fun (): Unit { } - fun0

fun (x: Any): Unit { } - fun1

fun (x: Any, y: Any): Unit { } - fun2
*/