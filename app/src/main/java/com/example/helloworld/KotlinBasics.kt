package com.example.helloworld

fun main() {

    // var can be changed later in the code
    // val cannot be changed later in the code -- constant

    // creating variable for my name
    // var myName = "Jon"
    // myName = "Bob"

    val myName = "Jon"

    // string concatenation
    print("Hello " + myName)

    // or I can use template
    print("Hello $myName")
}