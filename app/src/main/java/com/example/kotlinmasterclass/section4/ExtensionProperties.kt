package com.example.kotlinmasterclass.section4

fun main() {
    extensionPropertyExample1()
    extensionPropertyExample2()
    extensionPropertyExample3()
    extensionPropertyExample4()
}

fun extensionPropertyExample1() {
    println("Alberta".longOrShort)
}

fun extensionPropertyExample2() {
    println("Alberta".quoted())
}

fun extensionPropertyExample3() {
    println("Alberta".quoted2)
}

fun extensionPropertyExample4() {
    val numbers = listOf(1, 2, 3, 4, 5)
    println(numbers.getFirstOrNull)
    println(listOf<Int>().getFirstOrNull)
}

val String.longOrShort: String
    get() = if (length > 10) "Long" else "Short"

fun String.quoted() = "\"$this\""

// ALT Enter in property name -> Convert function to property
val String.quoted2 get() = "\"$this\""

val <T> List<T>.getFirstOrNull: T?
    get() = if (isEmpty()) null else first()