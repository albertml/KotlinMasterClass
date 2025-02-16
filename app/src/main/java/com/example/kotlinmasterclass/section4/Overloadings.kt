package com.example.kotlinmasterclass.section4

fun main() {
    println(overloadingExample("Alberta Gwapita"))
    println(overloadingExample(age = 35))
}

fun overloadingExample(name: String): String {
    return name
}

fun overloadingExample(age: Int): Int {
    return age
}

class OverloadingPerson {
    fun getName(name: String) = name
}

fun OverloadingPerson.getName2(name: String) = name