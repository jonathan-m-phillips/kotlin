package com.example.helloworld

// Normal function
fun addNumber(a: Int, b: Int){
    val add = a + b
    println(add)
}

//Lambda Expression
val sum1: (Int, Int) -> Int = {a: Int, b: Int -> a + b}

// Even shorter expression
val sum2 = {a: Int, b: Int -> a + b}

fun main() {

    // Normal function
    addNumber(5, 10)

    // Lambda Expression
    println(sum1(5, 10))

    // Shorter expression
    println(sum2(5, 10))


}