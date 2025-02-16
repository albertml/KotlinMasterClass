package com.example.kotlinmasterclass.section4

fun main() {
    genericsExample1()
    genericsExample2()
    genericsExample3()
    genericsExample4()
    genericsExample5()
}

fun genericsExample1() {
    val car = Car(tires = Tires(size = 17))
    println(car.getValue())
}

fun genericsExample2() {
    val car = GenericCar(tires = Tires(size = 17))
    val car2 = GenericCar(tires = "17")
    val car3 = GenericCar(tires = 17)

    println(car.getValue())
    println(car2.getValue())
    println(car3.getValue())
}

fun genericsExample3() {
    val vehicle = Vehicle(value = AnyGenericCar2())
    val car = vehicle.getValue()

    println((car as AnyGenericCar2).start())
}

fun genericsExample4() {
    val vehicle = Vehicle(value = AnyGenericCar())
    val car = vehicle.getValue()
    println(car.start())
}

fun genericsExample5() {
    val genericGetName1 = genericGetName(name = "Alberta")
    val genericGetName2 = genericGetName(name = Vehicle(value = 1))

    println(genericGetName1)
    println(genericGetName2)
}

data class Tires(val size: Int)

class Car(private val tires: Tires) {
    fun getValue() = tires
}

class GenericCar<T>(private val tires: T) {
    fun getValue(): T = tires
}

class Vehicle<T>(private val value: T) {
    fun getValue(): T = value
}

class AnyGenericCar2 {
    fun start() = "Starting the any engine"
}

class AnyGenericCar {
    fun start() = "Starting the engine"
}

fun <T> genericGetName(name: T): T = name