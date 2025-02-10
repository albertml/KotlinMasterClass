package com.example.kotlinmasterclass.section2

fun main() {
    ageRestriction(17)
    ageRestriction(19)

    val negativeResult = checkNumberSign(-1)
    val positiveResult = checkNumberSign(1)
    val zeroResult = checkNumberSign(0)

    println(negativeResult)
    println(positiveResult)
    println(zeroResult)
}

fun ageRestriction(age: Int) {
    if (age < 18) {
        println("Access Denied!")
    }

    if (age > 18) {
        println("Access Approved!")
    }
}

fun ageRestriction2(age: Int) {
    if (age < 18) println("Access Denied!")
    if (age > 18) println("Access Approved!")
}

fun ageRestriction3(age: Int) {
    if (age < 18) println("Access Denied!")
    if (age > 18 || age == 18) println("Access Approved!")
}


fun ageRestriction4(age: Int) {
    if (age < 18) println("Access Denied!")
    if (age >= 18) println("Access Approved!")
}

fun checkNumberSign(number: Int): String {
    return if (number > 0) {
        "positive"
    } else if (number < 0) {
        "negative"
    } else {
        "zero"
    }
}