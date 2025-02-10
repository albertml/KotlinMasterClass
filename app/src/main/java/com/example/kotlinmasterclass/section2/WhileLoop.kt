package com.example.kotlinmasterclass.section2

fun main() {
    whileLoop()
    whileLoop1()
    whileLoop2()
    whileLoop3()
    whileLoop4()
    whileLoop5()
    whileLoop6(input = "Alberta")
}

fun whileLoop() {
    var number = 0
    while (number < 10) {
        println(number)
        number++
    }
}

fun whileLoop1() {
    var number = 0
    while (number <= 10) {
        println(number)
        number++
    }
}

fun whileLoop2() {
    var number = 11
    while (number <= 10) {
        println(number)
        number++
    }
}

fun whileLoop3() {
    var number = 0
    while (condition(number = number)) {
        println(number)
        number += 10
    }
}

fun whileLoop4() {
    var number = 0

    do {
        println(number)
        number += 10
    } while (condition(number = number))
}

fun whileLoop5() {
    var number = 101

    do {
        println(number)
        number += 10
    } while (condition(number = number))
}

fun whileLoop6(input: String) {
    var number = 0
    while (number < input.length) {
        println(input[number])
        number++
    }
}

fun condition(number: Int) = number <= 100