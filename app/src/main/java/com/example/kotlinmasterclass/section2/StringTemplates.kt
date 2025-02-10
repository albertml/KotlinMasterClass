package com.example.kotlinmasterclass.section2

fun main() {
    stringTemplates()
    setAge(18)
    println(tripleQuotedString())
    println(tripleQuotedString2())
    println(tripleQuotedString3())
}

fun stringTemplates() {
    val number = 10
    val favoriteNumber = "My favorite number is: ${number.toFloat()}"
    println(favoriteNumber)
}

fun setAge(age: Int) {
    println(if (age < 18) "Minor" else "Adult")
}

fun tripleQuotedString(): String {
    val about = "Process finished with exit code 0. \nProcess finished with exit code 1. \nProcess finished with exit code 2."
    return about
}

fun tripleQuotedString2(): String {
    val about = "Process finished with exit code 0. \n" +
            "Process finished with exit code 1. \n" +
            "Process finished with exit code 2."
    return about
}

fun tripleQuotedString3(): String {
    val about = """
        |Process finished with exit code 0.
        |Process finished with exit code 1.
        |Process finished with exit code 2.
    """.trimMargin()
    return about
}