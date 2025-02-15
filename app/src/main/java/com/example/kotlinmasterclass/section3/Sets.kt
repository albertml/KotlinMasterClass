package com.example.kotlinmasterclass.section3

fun main() {
    setExample1()
    setExample2()
    setExample3()
    setExample4()
    setExample5()
    setExample6()
    setExample7()
    setExample8()
}

fun setExample1() {
    val mySet = setOf(1, 2, 2, 3, 3, 4, 6, 4)
    println(mySet)
}

fun setExample2() {
    val mySet = setOf(1, 2, 2, 3, 3, 4, 6, 4)
    println(2 in mySet)
}

fun setExample3() {
    val mySet = setOf(1, 2, 2, 3, 3, 4, 6, 4)
    println(mySet.containsAll(elements = setOf(1, 3, 6)))
}

fun setExample4() {
    val mySet = setOf(1, 2, 2, 3, 3, 4, 6, 4)
    println(mySet.containsAll(elements = setOf(1, 3, 5)))
}

fun setExample5() {
    val mySet = setOf(1, 2, 2, 3, 3, 4, 6, 4)
    println(mySet subtract setOf(6, 11))
}

fun setExample6() {
    val mySet = setOf(1, 2, 2, 3, 3, 4, 6, 4)
    println(mySet intersect  setOf(6, 11))
}

fun setExample7() {
    val mySet = setOf(1, 2, 2, 3, 3, 4, 6, 4)
    println(mySet union setOf(6, 11))
}

fun setExample8() {
    val myList = listOf(1, 2, 2, 3, 3, 4, 6, 4)
    println(myList.toSet())
    println(myList.distinct())
}

fun setExample9() {
    val immutableSet = setOf(1, 2, 2, 3, 3, 4, 6, 4)
    val mutableListSet = mutableSetOf(1, 2, 2, 3, 3, 4, 6, 4)
}