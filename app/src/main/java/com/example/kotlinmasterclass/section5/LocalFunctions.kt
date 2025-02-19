package com.example.kotlinmasterclass.section5

import com.example.kotlinmasterclass.section4.quoted

fun main() {
    localFunctionsExample1()
    localFunctionsExample2()
    localFunctionsExample3()
}

fun localFunctionsExample1() {
    val builder = StringBuilder()
    fun log(message: String) = builder.append(message)

    log(message = "Status..OK")
    log(message = "Wings..OK")
    log(message = "Engine starting...")

    println(builder)
}

fun localFunctionsExample2() {
    val list = listOf(1, 2, 3, 4, 5)
    list.forEach {
        if (it == 3) {
            return@forEach
        }

        println("Loop $it")
    }

    println("Completed")
}

fun localFunctionsExample3() {
    val list = listOf(1, 2, 3, 4, 5)
    list.forEach customName@ {
        if (it == 3) {
            return@customName
        }

        println("Loop $it")
    }

    println("Completed")
}

fun addQuotes() {
    fun String.quoted() = "\"$this\""
    println("Alberta Gwapita".quoted())
}