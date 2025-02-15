package com.example.kotlinmasterclass.section3

import com.example.kotlinmasterclass.section2.enterYourName as nameInput

fun main() {
    packageExample1()
    packageExample2()
    packageExample3()
}

fun packageExample1() {
    val packageImports = PackagesImports()
}

fun packageExample2() {
    val properties = House()
}

fun packageExample3() {
    val constructor = nameInput("Jayden")
}

class PackagesImports