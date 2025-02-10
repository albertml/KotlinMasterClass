package com.example.kotlinmasterclass.section2

fun main() {
    val result = sumOfTwoNumbers(b = 5, a = 3)
    println(result)

    val result2 = sumOfTwoNumbersDefaultArguments2(b = 5)
    println(result2)

    val result3 = sumOfTwoNumbersDefaultArguments3()
    println(result3)

    val result4 = sumOfTwoNumbersDefaultArguments3(b = 3, a = 5)
    println(result4)
}

fun sumOfTwoNumbersDefaultArguments(a: Int, b: Int) = a + b

fun sumOfTwoNumbersDefaultArguments2(a: Int = 10, b: Int) = a + b

fun sumOfTwoNumbersDefaultArguments3(a: Int = 10, b: Int = 8) = a + b