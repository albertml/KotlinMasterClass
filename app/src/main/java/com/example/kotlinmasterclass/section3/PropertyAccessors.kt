package com.example.kotlinmasterclass.section3

fun main() {
    paExample1()
    paExample2()
    paExample3()
    paExample4()
    paExample5()

    // NOTE: - Be careful to not perform expensive computation in property accessor to minimize side effects and to keep code clean and maintainable
}

fun paExample1() {
    val person = PAPerson()
    println(person.age)
    person.age = 10
    println(person.age)
}

fun paExample2() {
    val person = PAPerson2()
    println(person.age)
    println(person.age)
    println(person.age)
}

fun paExample3() {
    val person = PAPerson3()
    //person.ageVal = 8 // Cannot modify since its immutable
    person.ageVar = 8

    println(person.ageVal)
    println(person.ageVar)
}

fun paExample4() {
    val person = PAPerson4(age = 18)
    println(person.isMinor)
}

fun paExample5() {
    val person = PAPerson5()
    // person.age = 8  // Cannot modify since its immutable
    println(person.age)
    person.addAge(8)
    println(person.age)
}

class PAPerson {
    var age = 0
        get() {
            return field
        }

        set(value) {
            field = value
        }
}

class PAPerson2 {
    private var accesses = 0
    val age: Int
        get() = ++accesses
}

class PAPerson3 {
    val ageVal: Int = 0
        get() = field

    var ageVar: Int = 0
        get() = field
        set(value) {
            field = value
        }
}

class PAPerson4(
    val age: Int
) {
    val isMinor
        get() = age < 18
}

class PAPerson5 {
    var age = 0
        private set

    fun addAge(newAge: Int) {
        age = newAge
    }
}

