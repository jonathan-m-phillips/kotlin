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
    var result = 5 + 3
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
    val isEqual = 5 == 3 // --> false
    // println("isEqual is $isEqual")

    val isNotEqual = 5 != 5 // --> false
    // println("isNotEqual is $isNotEqual")

    // new way to write comparison in print line
    // println("is5Greater3 ${5 > 3}")
    // println("is5Greater3 ${-5 > 3}")
    // println("is5LowerEqual3 ${5 <= 3}")

    // Assignment Operators
    var myNum = 5
    myNum += 3
    myNum *= 4
    // println("myNum is $myNum")

    // incremented and decrementing operators (++, --)
    // myNum++
    // println("myNum is $myNum")
    // println("myNum is ${myNum++}")
    // println("myNum is ${++myNum}")
    // myNum--
    // println("myNum is $myNum")
    // println("myNum is ${myNum--}")
    // println("myNum is ${--myNum}")

    val heightPerson1 = 72 // inches
    val heightPerson2 = 70 // inches

    // writing if else statement for a fighter
    if (heightPerson1 > heightPerson2) {
        println("use raw force")
    } else if (heightPerson1 == heightPerson2) {
        println("use your power technique 1337")
    } else {
        println("use technique")
    }


    val age = 17

    if (age >= 21) {
        println("now you may drink")
    } else if (age >= 18){
        println("you may vote now")
    } else if (age >= 16) {
        println("you may drive now")
    } else {
        println("you are too young")
    }

    when (age) {
        15 -> println("You are too young")
        16 -> println("You can drive")
        18 -> println("You can vote")
        21 -> println("You can drink")
    }

    // OR

    when (age) {
        in 1..15 -> println("You are too young")
        16, 17 -> println("You can drive")
        in 18..20 -> println("You can vote")
        !in 0..20 -> println("You can drink")
        //in 21..120 -> println("You can drink")
    }


    var season = 3
    when (season) {
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> {
            println("Fall")
            println("Autumn")
        }
        4 -> println("Winter")
        else -> println("Invalid Season")
    }

    var month = 12
    when (month) {
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Fall")
        12, 1, 2 -> println("Winter")
    }

    var x : Any = 13.37F
    when(x) {
        is Int -> println("$x is an Int")
        is Double -> println("$x is a Double")
        is String -> println("$x is a String")
        is Float -> println("$x is a float")
        else -> println("$x is none of the above")
    }


    // while loop refresher
    var feltTemp = "cold"
    var roomTemp = 65
    while (feltTemp == "cold") {
        roomTemp++
        if (roomTemp == 70) {
            feltTemp = "warm"
            println(feltTemp)
            break;
        }
        println(roomTemp)
    }

    // for loop in kotlin
    // prints 1 - 10
    for (num in 1..10) {
        println(num)
    }

    // prints 1 - 9
    for (i in 1 until 10) {
        println(i)
    }

    // prints 10 - 1
    for (j in 10 downTo 1) {
        println(j)
    }

    // prints 10 - 1 --> 10, 8, 6, 4, 2
    for (j in 10 downTo 1 step 2) {
        println(j)
    }

    // same as the for loop prior
    for (k in 10.downTo(1).step(2)) {
        println(k)
    }

    val jon = Person("Jon", "Phillips")
    val john = Person()
    val johnPeterson = Person(lastName = "Peterson")

    val iPhoneX = MobilePhone("iOS", "Apple", "iPhone X")
    val googlePixel4 = MobilePhone("Android", "Google", "Pixel 4")

}

class Person (firstName: String = "John", lastName: String = "Doe"){

    // Initializer Block
    init {
        println("Initialized a new Person object with " +
        "firstName = $firstName and lastName = $lastName")
    }
}

class MobilePhone (osName: String, brand: String, model: String){

    init {
        println("$osName - $brand $model")
    }
}