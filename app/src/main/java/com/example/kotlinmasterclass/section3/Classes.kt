package com.example.kotlinmasterclass.section3

fun main() {
    classExample1()
    classExample2()
}

fun classExample1() {
    val house = House()
    val house2 = House()
    println(house)
    println(house2)
}

fun classExample2() {
    val house = House()
    println(house.enterTheHouse())
}

class House {
    fun enterTheHouse() = "Entering the house..."
}