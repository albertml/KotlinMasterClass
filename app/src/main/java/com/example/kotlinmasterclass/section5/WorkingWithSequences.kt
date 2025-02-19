package com.example.kotlinmasterclass.section5

fun main() {
    workingWithSequencesExample1()
    workingWithSequencesExample2()
    workingWithSequencesExample3()

    // Use Sequence over list when performing chaining operations
}

fun workingWithSequencesExample1() {
    val list = listOf(1, 2, 3, 4, 5)
    list.filter { it % 2 == 0 }.map { it * it }.any { it < 10 }
}

fun workingWithSequencesExample2() {
    val list = listOf(1, 2, 3, 4, 5)
    println("--LIST--")
    list
        .filter(Int::isEven)
        .map(Int::square)
        .any(Int::lessThanTen)

    println("--SEQUENCE--")
    list
        .asSequence()
        .filter(Int::isEven)
        .map(Int::square)
        .any(Int::lessThanTen)
}

fun workingWithSequencesExample3() {
    val people = listOf(
        SequencePerson(name = "Alberto", age = 18),
        SequencePerson(name = "Alberta", age = 19),
        SequencePerson(name = "Ricardo", age = 20),
    )

    val isSweetEighteenGwapitos = people
        .filter(SequencePerson::isGwapo)
        .filter(SequencePerson::isSweetEighteen)

    println(isSweetEighteenGwapitos)
}

fun Int.isEven(): Boolean {
    println("isEven()")
    return this % 2 == 0
}

fun Int.square(): Int {
    println("square()")
    return this * this
}

fun Int.lessThanTen(): Boolean {
    println("lessThanTen()")
    return this < 10
}

fun SequencePerson.isGwapo(): Boolean {
    return this.name == "Alberto"
}

fun SequencePerson.isSweetEighteen(): Boolean {
    return this.age == 18
}

data class SequencePerson(
    val name: String,
    val age: Int
)