package com.example.kotlinmasterclass.section5

import kotlin.random.Random

fun main() {
    lambdaExample1()
    lambdaExample2()
    lambdaExample3()
    lambdaExample4()
    lambdaExample5()
    lambdaExample6()
}

fun lambdaExample1() {
    val numbers = listOf(1, 2, 3)
    val quotedNumbers = numbers.map { number ->
        "\"$number\""
    }

    println(numbers)
    println(quotedNumbers)
}

fun lambdaExample2() {
    val numbers = listOf(1, 2, 3)

    val quotedNumbers = numbers.joinToString { number ->
        "\"$number\""
    }

    println(quotedNumbers)
}

fun lambdaExample3() {
    val numbers = listOf(1, 2, 3)
    val quoted = { number: Int ->  "\"$number\"" }
    val quotedNumbers = numbers.joinToString(transform = quoted)

    println(quotedNumbers)
}

fun lambdaExample4() {
    val numbers = listOf(1, 2, 3)
    val quoted = { number: Int ->  "\"$number\"" }

    val quotedNumbers = numbers.mapIndexed { _, number ->
        "$number"
    }

    println(quotedNumbers)
}

fun lambdaExample5() {
    buttonVoid {
        println("Button Tapped")
    }
}

fun lambdaExample6() {
    button { random ->
        "$random"
    }
}

fun buttonVoid(onClick: () -> Unit) {
    onClick()
}

fun button(onClick: (Int) -> String) {
    onClick(Random.nextInt(from = 0, until = 100))
}