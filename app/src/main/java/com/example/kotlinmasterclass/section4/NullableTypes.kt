package com.example.kotlinmasterclass.section4

import androidx.compose.ui.text.resolveDefaults

fun main() {
    nullableExample1()
    nullableExample2()
}

fun nullableExample1() {
    val map = mapOf(1 to  "One")
    val result = map[2]
    println(result)

    val regularString = "abc"
    val nullableString: String? = null
    val text2: String? = regularString // Not necessary
    val text3: String = text2.orEmpty()

    if (nullableString != null) {
        println(nullableString.length)
    }
}

fun nullableExample2() {
    val person = NullablePerson(name = "Alberta", age = 35)
    val nullablePerson: NullablePerson? = null
}

data class NullablePerson(
    val name: String,
    val age: Int
)