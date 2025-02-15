package com.example.kotlinmasterclass.section3

fun main() {
    visibilityModifier1()
    visibilityModifier2()
    visibilityModifier3()
}

fun visibilityModifier1() {
    val person = VisibilityModifiers(name = "Alberta")
    person.getTheName()
}

fun visibilityModifier2() {
    val person = VisibilityModifiers(name = "Alberta")
    //person.getTheNickName // Cannot access due to its private visibility modifiers
}

fun visibilityModifier3() {

}

private class VisibilityModifiers(private val name: String) {
    private val nickname = "Alberta"

    fun getTheName() {
        println("Public: $name")
    }

    private fun getTheNickName() {
        println(nickname)
    }
}