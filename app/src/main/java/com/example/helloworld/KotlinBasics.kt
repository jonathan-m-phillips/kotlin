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
    // println("Hello " + myName)

    // or I can use template
    // println("Hello $myName")

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
    // println("First character: " + firstCharInString)
    // template
    // println("First character: $firstCharInString")

    // string concatenation
    // println("Last character: " + lastCharInString)
    // template
    // println("Last character: $lastCharInString")

    // Arithmetic operators (+, -, *, /, %)
    var result = 5+3
    // result = result / 2
    result /= 2 // --> 4
    result *= 2 //--> 16
    result += 2 //--> 10
    result -= 2 //--> 6
    result %= 2 // --> 0
    val a = 5.0
    val b = 3
    // converts value to integer .toInt()
    result = (a / b).toInt() //--> 1
    var resultDouble: Double
    resultDouble = a / b // --> 1.6666666667
    // println(resultDouble)


    // Comparison Operators
    val isEqual = 5==3 // --> false
    println("isEqual is $isEqual")

    val isNotEqual = 5!=5 // --> false
    println("isNotEqual is $isNotEqual")

    // new way to write comparison in print line
    println("is5Greater3 ${5 > 3}")
    println("is5Greater3 ${-5 > 3}")
    println("is5LowerEqual3 ${5 <= 3}")

    // Assignment Operators
    var myNum = 5
    myNum += 3
    myNum *= 4
    println("myNum is $myNum")

    // incremented and decrementing operators (++, --)
    myNum++
    println("myNum is $myNum")
    println("myNum is ${myNum++}")
    println("myNum is ${++myNum}")
    myNum--
    println("myNum is $myNum")
    println("myNum is ${myNum--}")
    println("myNum is ${--myNum}")









}