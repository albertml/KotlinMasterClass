package com.example.kotlinmasterclass.section3

fun main() {
    println(sumVararg(1,2,3,4,5))
    println(sumVararg())
    println(sumVararg(numbers = intArrayOf(1,2,3,4,5)))

    val myArray = intArrayOf(6, 8, 10)
    println(sumVararg(numbers = intArrayOf(1,2,3,4,5, *myArray)))
}


// It's possible without no parameters
fun sumVararg(vararg numbers: Int): Int {
    var total = 0
    for (n in numbers) {
        total += n
    }

    return total
}

// Vararg is applicable only for 1 parameters
//fun sumVararg2(vararg numbers: Int, vararg numbers2: Int): Int {
//    var total = 0
//    for (n in numbers) {
//        total += n
//    }
//
//    return total
//}