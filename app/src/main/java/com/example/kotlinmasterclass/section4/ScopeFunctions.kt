package com.example.kotlinmasterclass.section4

fun main() {
    scopeFunctionsLet()
    scopeFunctionsRun()
    scopeFunctionsWith()
    scopeFunctionsApply()
    scopeFunctionsAlso()

    // Scope Functions
    // 1. let
    // 2. run
    // 3. with
    // 4. apply
    // 5. also
}

fun scopeFunctionsLet() {
    val name: String? = "Alberta"
    val length = name?.let {
        println("Name is not null.")
        it.length
    } ?: 0

    println("Length: $length")
}

fun scopeFunctionsRun() {
    val person = ScopePerson(name = "Alberta", age = 35)
    val result = person.run {
        age += 100
        "Name: $name - Age: $age"
    }

    println(result)
}

fun scopeFunctionsWith() {
    val person = ScopePerson(name = "Alberta", age = 35)
    val result = with(person) {
        age += 100
        "Name: $name - Age: $age"
    }

    println(result)
}

fun scopeFunctionsApply() {
    val person = ScopePerson(name = "Alberta", age = 35)
    val result = person.apply {
        name = "Alberto"
        age = 88
    }

    println(result)
}

fun scopeFunctionsAlso() {
    val numbers = mutableListOf(1, 2, 3, 4, 5)
    val sum = numbers
        .also { println("Original list: $it") }
        .sum()

    println(sum)
}

data class ScopePerson(
    var name: String,
    var age: Int
)