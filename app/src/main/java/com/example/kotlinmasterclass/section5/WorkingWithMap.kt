package com.example.kotlinmasterclass.section5

fun main() {
    workingMapExample1()
    workingMapExample2()
    workingMapExample3()
    workingMapExample4()
    workingMapExample5()
}

fun workingMapExample1() {
    val people = mapPersonList()

    println(people)

    val map: Map<Int, List<MapPerson>> = people.groupBy(MapPerson::age)
    println(map)
    println(map[21])
}

fun workingMapExample2() {
    val people = mapPersonList()

    val map = people.associateWith(MapPerson::name)
    println(map)
}

fun workingMapExample3() {
    val people = mapPersonList()

    val map = people.associateBy(MapPerson::name)
    println(map)
}

fun workingMapExample4() {
    val people = mapPersonList()

    val map = people.associateBy(MapPerson::name)
    println(map)
    println(map.keys)
    println(map.values)
    println(map.getOrElse(key = "Alice123") { "Unknown" })
    println(map.getOrElse(key = "Alice") { "Unknown" })
}

fun workingMapExample5() {
    val people = mapPersonList()

    val map = people.associateBy(MapPerson::name)
    val mutableMap = map.toMutableMap()
    println(mutableMap)

    println(mutableMap.getOrPut(key = "Alice123") {
        MapPerson(name = "Alice123", age = 34)
    })

    println(mutableMap)

    println(mutableMap.filterKeys { it.startsWith(prefix = "A") })

    val result = mutableMap.map { (_, value) ->
        "\"${value.name} = ${value.age }\""
    }
    println(result)
}

fun mapPersonList(): List<MapPerson> {
    val names = listOf("Alice", "Bob", "Bill", "Marry", "John")
    val ages = listOf(21, 15, 25, 25, 42)
    val people = names.zip(ages) { name, age ->
        MapPerson(name = name, age = age)
    }

    return people
}

data class MapPerson(
    val name: String,
    val age: Int
)