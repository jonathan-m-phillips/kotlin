package com.example.helloworld

fun main() {

    // var can be changed later in the code
    // val cannot be changed later in the code -- constant

    // creating variable for my name
    // var myName = "Jon"
    // myName = "Bob"

    // immutable variable -- constant
    // string type
    val myName = "Jon"

    // string concatenation
    println("Hello " + myName)

    // or I can use template
    println("Hello $myName")

    // type int 32 bit
    val myAge = 30

    // Integer TYPES - Byte: 8 bit; Short: 16 bit; Int: 32 bit; Long: 64 bit;
    // variable (name) : (TYPE) = (value)
    // this is not necessary but can be used
    val myByte: Byte = 13
    val myShort: Short = 125
    val myInt: Int = 123123123
    val myLong: Long = 1_039_812_309_487_120_394

    // Floating Point number TYPES - Float: 32 bit; Double 64 bit;
    // Float needs an F at the end of the number or else Kotlin will assume it is a double
    // Float is for faster calculations -- Double is for exact calculations
    val myFloat: Float = 13.37F
    val myDouble: Double = 3.14159265358979323846

    // Booleans
    // var isSunny: Boolean = true
    // or
    var isSunny = true
    isSunny = false

    // Characters
    val letterChar = 'A'
    val digitChar = '1'

    // Strings
    val myStr = "Hello World"
    val firstCharInString = myStr[0]
    val lastCharInString = myStr[myStr.length - 1]

    // string concatenation
    println("First character: " + firstCharInString)
    // template
    println("First character: $firstCharInString")

    // string concatenation
    println("Last character: " + lastCharInString)
    // template
    println("Last character: $lastCharInString")

}