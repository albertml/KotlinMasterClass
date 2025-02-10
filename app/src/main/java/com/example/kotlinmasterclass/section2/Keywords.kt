package com.example.kotlinmasterclass.section2

fun main() {
    keyword()
    keyword2()
    println(isDigit(ch = 'a'))
    println(isDigit(ch = '2'))
    println(isNotDigit(ch = 'a'))
    println(isNotDigit(ch = '2'))
    println(isLowerCase(ch = 'a'))
    println(isUpperCase(ch = 'A'))
}

fun keyword() {
    val number = 40
    println(number in 0..100)
}

fun keyword2() {
    println('t' in "Kotlin")
    println('t' in "KoTlin")
}

fun isDigit(ch: Char) = ch in '0'..'9'
fun isNotDigit(ch: Char) = ch !in '0'..'9'
fun isLowerCase(ch: Char) = ch in 'a'..'z'
fun isUpperCase(ch: Char) = ch in 'A'..'Z'