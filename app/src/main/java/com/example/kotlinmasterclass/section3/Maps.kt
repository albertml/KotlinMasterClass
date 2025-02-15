package com.example.kotlinmasterclass.section3

fun main() {
    mapExample1()
    mapExample2()
    mapExample3()
    mapExample4()
    mapExample5()
    mapExample6()
    mapExample7()
    mapExample8()
    mapExample9()
    mapExample10()
}

val animals = mapOf(
    "Monkey" to "brown",
    "Tiger" to "orange",
    "Whale" to "blue"
)

fun mapExample1() {
    println(animals["Monkey"])
}

fun mapExample2() {
    println(animals["Dog"])
}

fun mapExample3() {
    val keys = animals.keys
    val values = animals.values

    println(keys)
    println(values)
}

fun mapExample4() {
    for (entry in animals) {
        println("${entry.key} : ${entry.value}")
    }
}

fun mapExample5() {
    for ((key, value) in animals) {
        println("Key $key : Value $value")
    }
}

fun mapExample6() {
    animals.forEach { (key, value) ->
        println("Key $key : Value $value")
    }
}

fun mapExample7() {
    println(animals.getOrDefault(key = "Monkey", defaultValue = "Black"))
    println(animals.getOrDefault(key = "Dog", defaultValue = "Black"))
}

fun mapExample8() {
    val filteredMap = animals.filter {
        it.value.length > 4
    }

    println(filteredMap)
}

fun mapExample9() {
    val animalList = listOf("Monkey", "Tiger", "Whale")
    println(animalList.associateBy { it })
}

fun mapExample10() {
    val monkey = AnimalMap(name = "Monkey", age = 2)
    val tiger = AnimalMap(name = "Tiger", age = 4)
    val whale = AnimalMap(name = "Whale", age = 6)

    val animalList = listOf(monkey, tiger, whale)
    val animalMap = animalList.associateBy({ it.name }, {it.age})

    println(animalMap)
}

class AnimalMap(
    val name: String,
    val age: Int
)