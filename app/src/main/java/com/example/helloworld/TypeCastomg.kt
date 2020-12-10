package com.example.helloworld

fun main() {

    val stringList: List<String> = listOf("Jon", "Frank", "Michael", "Gary")

    val mixedTypeList: List<Any> = listOf("Jon", 30, 7, "BDay", 200.5, "weighs", "lbs")

//    for (value in mixedTypeList) {
//        if (value is Int) {
//            println("Integer: '$value'")
//        } else if (value is Double) {
//            println("Double: '$value' with Floor value ${Math.floor(value)}")
//        } else if (value is String) {
//            println("String: '$value' of length ${value.length}")
//        } else {
//            println("Unknown Type")
//        }
//    }

    for (value in mixedTypeList) {
        when(value) {
            is Int -> println("Integer: '$value'")
            is Double -> println("Double: '$value' with Floor value ${Math.floor(value)}")
            is String -> println("String: '$value' of length ${value.length}")
            else -> println("Unknown Type")
        }
    }

    // Smart cast
    val obj1: Any = "I have a dream"
    if (obj1 !is String) {
        println("Not a string")
    } else {
        // obj is automatically cast to a String in this scope
        println("Found a String of length ${obj1.length}")
    }

    // Explicit (unsafe) Casting using the "as" keyword - can go wrong
    val str1: String = obj1 as String
    println(str1.length)

    // val obj2: Any = 1337
    // val str2: String = obj2 as String // Does not work
    // println(str2)

    // Explicit (safe) casting using the "as?" keyword
    val obj3: Any = 1337
    val str3: String? = obj3 as? String // Works
    println(str3) // Prints null

}