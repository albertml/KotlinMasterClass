package com.example.kotlinmasterclass.section4

import kotlin.random.Random

fun main() {
    whenExample1()
    whenExample2()
    whenExample3()
    whenExample4()
}

fun whenExample1() {
    when(Random.nextInt(from = 1, until = 5)) {
        1 -> {
            println("One")
        }
        2 -> {
            println("Two")
        }
        3 -> {
            println("Three")
        }
        4 -> {
            println("Four")
        }
    }
}

fun whenExample2() {
    val result = when(Random.nextInt(from = 1, until = 5)) {
        1 -> {
            1
        }
        2 -> {
            2
        }
        3 -> {
            3
        }
        else -> {
            null
        }
    }

    println(result)
}

fun whenExample3() {
    when (getPerson()) {
       is WhenPerson.Male -> {
           println("Male")
       }

        is WhenPerson.Female -> {
            println("Female")
        }
    }
}

fun whenExample4() {
    val number = listOf(1, 2, 3, 4, 5)
    for (n in number) {
        when (n) {
//            1 -> {
//                break
//            }
            2 -> {
                continue
            }
            3 -> {
                println("Three")
            }
            4 -> {
                println("Four")
            }
            5 -> {
                println("Five")
            }
        }
    }
}

fun getPerson(): WhenPerson {
    return if (Random.nextInt(from = 1, until = 3) == 1) WhenPerson.Male else WhenPerson.Female
}

sealed class WhenPerson {
    object Male: WhenPerson()
    object Female: WhenPerson()
}