package com.example.kotlinmasterclass.section5

fun main() {
    workingListExample1()
    workingListExample2()
    workingListExample3()
    workingListExample4()
}

fun workingListExample1() {
    val first = listOf("a", "b", "c", "d", "e")
    val second = listOf(1, 2, 3, 4, 5)
    println(first.zip(second))
    println(first.zip(0..10))
    println((10..100).zip(second))
}

fun workingListExample2() {
    val ids = listOf(10, 11, 12)
    val names = listOf("Bob", "Jill", "Jim")
    val result = ids.zip(names) { id, name ->
        ListPerson(id = id, name = name)
    }

    println(result)
}

fun workingListExample3() {
    val numbersMap = mapOf(1 to "One", 2 to "Two", 3 to "Three", 4 to "Four")
    println(numbersMap.toList())

    val (numbers, text) = numbersMap.toList().unzip()
    println(numbers)
    println(text)
}

fun workingListExample4() {
    val list = listOf(
        listOf(1, 2),
        listOf(4, 5),
        listOf(7, 8)
    )

    println(list)
    println(list.flatten())
}

data class ListPerson(
    val id: Int,
    val name: String
)