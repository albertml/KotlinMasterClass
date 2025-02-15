package com.example.kotlinmasterclass.section3

fun main() {
    listExample1()
    listExample2()
    listExample3()
    listExample4()
    puzzleOperator()

    /**
     * MutableList can be a list
     * List cannot be a MutableList
     * Prefer Immutable or Read Only
     * Prefer Property/Variable to declare VAL or VAR
     * Prefer List over MutableList
     */
}

fun listExample1() {
    val numbers = listOf(1, 2, 3, 4, 5)
    println(numbers)
    println(numbers[0])
}

fun listExample2() {
    val numbers = listOf(1, 2, 3, 4, 5)
    println(numbers.first())
    println(numbers.last())
    print(numbers.takeLast(3))
}

fun listExample3() {
    val numbers = listOf(1, 2, 3, 4, 5)
    println(countOccurences(number = 2, list = numbers))
}

fun listExample4() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val number2 = mutableListOf<Int>()
    println(number2)
    number2.addAll(numbers )
    println(number2)
    number2.remove(3)
}

fun puzzleOperator() {
    var numbers = listOf(1, 2, 3)
    println(numbers)
    numbers += 1
    println(numbers)
}

fun countOccurences(list: List<Int>, number: Int): Int {
    var occurences = 0
    for (e in list) {
        if (number == e) {
            occurences++
        }
    }

    return occurences
}