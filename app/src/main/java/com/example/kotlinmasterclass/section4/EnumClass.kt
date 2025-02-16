package com.example.kotlinmasterclass.section4

fun main() {
    enumExample1()
    enumExample2()
    enumExample3()
    enumExample4()
    enumExample5()
}

fun enumExample1() {
    val priority = Priority.LOW
    println(priority)
}

fun enumExample2() {
    val priority = Priority2.HIGH
    println(priority.color)
}

fun enumExample3() {
    val priority = Priority2.valueOf(value = "LOW")
    println(priority)
}

fun enumExample4() {
    for (pri in Priority2.entries) {
        println(pri)
    }
}

fun enumExample5() {
    val priorityLow = Priority2.LOW
    println(priorityLow.number)

    val priorityMedium = Priority2.MEDIUM
    println(priorityMedium.number)

    val priorityHigh = Priority2.HIGH
    println(priorityHigh.number)
}

enum class Priority {
    LOW, MEDIUM, HIGH
}

enum class Priority2(
    val color: String
) {
    LOW(color = "Green"),
    MEDIUM(color = "Orange"),
    HIGH(color = "Red");

    val number: Int
        get() = when (this) {
            LOW -> 1
            MEDIUM -> 2
            HIGH -> 3
        }
}