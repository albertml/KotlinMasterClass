package com.example.kotlinmasterclass.section5

fun main() {
    memberReferences1()
    memberReferences2()
    memberReferences3()

    // Class::Member
}

fun memberReferences1() {
    val people = listOf(
        MemberPerson(name = "John", age = 20, male = true),
        MemberPerson(name = "Michael", age = 21, male = true),
        MemberPerson(name = "Sam", age = 22, male = true),
        MemberPerson(name = "Ana", age = 23, male = false),
        MemberPerson(name = "Jennifer", age = 24, male = false)
    )

    people.filter { person -> person.male }.forEach( {
        println(it.name)
    })

    people.filter { person -> !person.male }.forEach( {
        println(it.name)
    })
}

fun memberReferences2() {
    val people = listOf(
        MemberPerson(name = "John", age = 20, male = true),
        MemberPerson(name = "Michael", age = 21, male = true),
        MemberPerson(name = "Sam", age = 22, male = true),
        MemberPerson(name = "Ana", age = 23, male = false),
        MemberPerson(name = "Jennifer", age = 24, male = false)
    )

    people.filter(MemberPerson::male).forEach { println(it.name) }
    people.filterNot(MemberPerson::male).forEach { println(it.name) }
    people.sortedBy(MemberPerson::age).forEach { println(it.name) }
    people.sortedByDescending(MemberPerson::age).forEach { println(it.name) }

    println(people.any(MemberPerson::important))
    println(people.any(::important2))
}

fun memberReferences3() {
    val names = listOf("Dog", "Cat")
    println(names.mapIndexed(:: MemberAnimal))
    println((names.mapIndexed { index, name ->
        MemberAnimal(id = index, name = name)
    }))
}

fun MemberPerson.important() = this.name.startsWith(prefix = "M") && this.age > 20
fun important2(person: MemberPerson) = person.name.startsWith(prefix = "M") && person.age > 20

data class MemberPerson(
    val name: String,
    val age: Int,
    val male: Boolean
)

data class MemberAnimal(
    val id: Int,
    val name: String
)