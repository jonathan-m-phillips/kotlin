package com.example.helloworld

fun main() {

    // argument
    var addition = addUp(2, 5)
    println("result is $addition")

    var avg = average(98.0, 97.0)
    println("average is $avg")

}

fun myFunction() {
    println("Called from myFunction")
}

// Method - a Method is a Function within a Class
// Parameter (input)
fun addUp(a: Int, b: Int) : Int {
    // output
    return a + b
}

fun average(a: Double, b: Double) : Double {
    return (a + b) / 2
}