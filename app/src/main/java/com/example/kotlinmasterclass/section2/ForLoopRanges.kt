package com.example.kotlinmasterclass.section2

fun main() {
    forLoop()
    forLoop2()
    forLoop3()
    forLoop4()
    forLoop5()
    forLoop6()
    forLoop7()
    repeat(times = 3) {
        println("Kotlin is the best")
    }
}

fun forLoop() {
    val elements = listOf("A", "B")
    for (e in elements) {
        println("Current Element: $e")
    }
}

fun forLoop2() {
    for (number in 1..3) {
        println("Current Element: $number")
    }
}

fun forLoop3() {
    val range1 = 1..10
    val range2 = 0 until 10

    println(range1)
    println(range2)
}

fun forLoop4() {
    intProgression(range = 1..3)
    intProgression(range = 3 downTo 1)
    intProgression(range = 0..10 step 2)
    intProgression(range = 9 downTo 0 step 3)
}

fun forLoop5() {
    for (c in 'a'..'z') {
        println(c)
    }
}

fun forLoop6() {
    val character: Char = 'a'
    print(character + 25)
}

fun forLoop7() {
    for (character in "Alberta ") {
        println(character + 1)
    }
}

fun intProgression(range: IntProgression) {
    for (number in range) {
        println("Current Number: $number")
    }

    print(" // $range")
}