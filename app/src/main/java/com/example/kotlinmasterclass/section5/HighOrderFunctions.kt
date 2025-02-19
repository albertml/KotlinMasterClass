package com.example.kotlinmasterclass.section5

fun main() {
    highOrderFunctionExample1()
    highOrderFunctionExample2()
}

fun highOrderFunctionExample1() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val moreThanTwo: (Int) -> Boolean = { it > 2 }
    println(numbers.any(moreThanTwo))
}

fun highOrderFunctionExample2() {
    repeat(times = 5) { index ->
        println("$index")
    }

    val sumInt = calculate(pair = Pair(5, 3), operation = ::sum)
    println(sumInt)
    val sumDouble = calculate(pair = Pair(5.3, 3.8), operation = ::sum)
    println(sumDouble)

    val subtract = calculate(pair = Pair(5.0, 3.0), operation = ::subtract)
    println(subtract)

    val multiply = calculate(pair = Pair(5.0, 3.0), operation = ::multiply)
    println(multiply)

    val divide = calculate(pair = Pair(5.0, 3.0), operation = ::divide)
    println(divide)

    val sum1 = calculate(pair = Pair(8.8, 9.2)) { x ->
        x.first.toDouble() + x.second.toDouble()
    }

    println(sum1)

    val sum2 = calculate(param1 = 4.3, param2 = 3.7, operation = ::add)
    println(sum2)
}

fun <T, R>calculate(param1: T, param2: R, operation: (T, R) -> T): T {
    return operation(param1, param2)
}

fun add(param1: Double, param2: Double): Double {
    return param1 + param2
}

fun <T>calculate(pair: Pair<T, T>, operation: (Pair<T, T>) -> T): T {
    return operation(pair)
}

fun <T: Number> sum(pair: Pair<T, T>) = pair.first.toDouble() + pair.second.toDouble()
fun <T: Number> subtract(pair: Pair<T, T>) = pair.first.toDouble() - pair.second.toDouble()
fun <T: Number> multiply(pair: Pair<T, T>) = pair.first.toDouble() * pair.second.toDouble()
fun <T: Number> divide(pair: Pair<T, T>) = pair.first.toDouble() / pair.second.toDouble()
