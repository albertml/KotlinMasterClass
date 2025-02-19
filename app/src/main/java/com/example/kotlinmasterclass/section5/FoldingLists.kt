package com.example.kotlinmasterclass.section5

fun main() {
    foldingListExample1()
    foldingListExample2()
    foldingListExample3()
    foldingListExample4()
    foldingListExample5()
}

fun foldingListExample1() {
    val list = listOf(1, 10, 100, 1000)
    val result = list.fold(initial = 0) { sum, number ->
        println("Initial: $sum, Number: $number")
        sum + number
    }

    println("Final: $result")
}

fun foldingListExample2() {
    foldReplica()
}

fun foldingListExample3() {
    val list = listOf(1, 10, 100, 1000)
    val result = list.foldRight(initial = 0) { sum, number ->
        println("Initial: $sum, Number: $number")
        sum + number
    }

    println("Final: $result")
}

fun foldingListExample4() {
    val list = listOf(1, 10, 100, 1000)
    val result = list.reduce { sum, number ->
        sum + number
    }

    println("Final Reduce: $result")
}

fun foldingListExample5() {
    val list = listOf(1, 10, 100, 1000)
    val result = list.runningFold(initial = 0) { sum, number ->
        sum + number
    }

    println("Final Reduce: $result")
}

fun foldReplica() {
    val list = listOf(1, 10, 100, 1000)
    var accumulator = 0
    val operation = { sum: Int, number: Int -> sum + number }

    for (number in list) {
        accumulator = operation(accumulator, number)
    }

    println(accumulator)
}