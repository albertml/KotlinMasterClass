package com.example.kotlinmasterclass.section4

fun main() {
    safeCallsExample1()
//    safeCallsExample2()
    safeCallsExample3()
    safeCallsExample4()
}

fun safeCallsExample1() {
    nullableGetName(name = "Alberta")
    nullableGetName(name = null)
}

fun safeCallsExample2() {
    nullableForceGetName(name = "Alberta")
    nullableForceGetName(name = null)
}

fun safeCallsExample3() {
    nullableElvisGetName(name = "Alberta")
    nullableElvisGetName(name = null)
}

fun safeCallsExample4() {
    nullableCheckGetName(name = "Alberta")
    nullableCheckGetName(name = null)
}

fun nullableGetName(name: String?) {
    println(name?.length)
}

fun nullableForceGetName(name: String?) {
    println(name!!.length) // Avoid using double bang (!!)
}

fun nullableElvisGetName(name: String?) {
    println(name?.length ?: 0)
}

fun nullableCheckGetName(name: String?) {
    println(name.orEmpty())
}