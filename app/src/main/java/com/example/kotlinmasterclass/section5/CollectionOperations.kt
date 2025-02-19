package com.example.kotlinmasterclass.section5

fun main() {
    collectionOperationExample1()
    collectionOperationExample2()
    collectionOperationExample3()
    collectionOperationExample4()
    collectionOperationExample5()
    collectionOperationExample6()
    collectionOperationExample7()
    collectionOperationExample8()
}

fun collectionOperationExample1() {
    val list1 = List(size = 10) { it }
    val list2 = MutableList(size = 10) { it }

    println(list1)
    println(list2)
}

fun collectionOperationExample2() {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val numberList2 = listOf(1, null, null, 4, 5, 6, 7, 8, 9, 10)

    println(numberList.filter { number ->
        number > 5
    })
    println(numberList.filterIndexed( { index, number ->
        index == 0
    }))

    println(numberList2.filterNotNull())
}

fun collectionOperationExample3() {
    val numberList = listOf(1, 2, 3, 4, 4, 5, 6, 7, 8, 9, 10)
    println(numberList.count())
    println(numberList.count { number ->
        number == 4
    })
}

fun collectionOperationExample4() {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(numberList.find { number ->
        number == 11
    })

    println(numberList.find { number ->
        number == 5
    })

    println(numberList.firstOrNull())
    println(numberList.lastOrNull())
}

fun collectionOperationExample5() {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(numberList.any { number ->
        number == 1
    })
    println(numberList.all { number ->
        number > 1
    })
    println(numberList.none { number ->
        number > 9
    })
}

fun collectionOperationExample6() {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val (match, noMatch) = numberList.partition { number ->
        number < 6
    }

    println(match)
    println(noMatch)
}

fun collectionOperationExample7() {
    val randomNumbers = listOf(2, 3, 1, 5, 4, 6, 7, 8, 9, 10)
    println(randomNumbers.sum())
    println(randomNumbers)
    println(randomNumbers.sorted())
    println(randomNumbers.sortedDescending())
}

fun collectionOperationExample8() {
    val personList = listOf(
        CollectionPerson(name = "John", age = 32),
        CollectionPerson(name = "Marry", age = 25),
        CollectionPerson(name = "Marlon", age = 45),
    )

    println(personList.sumOf { person ->
        person.age
    })

    println(personList.sortedBy { person ->
        person.age
    })

    val randomNumbers = listOf(2, 3, 1, 5, 4, 6, 7, 8, 9, 10)

    println(randomNumbers.take(n = 4))
    println(randomNumbers.drop(n = 4))
}

data class CollectionPerson(
    val name: String,
    val age: Int
)