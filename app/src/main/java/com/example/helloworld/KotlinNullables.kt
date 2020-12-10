package com.example.helloworld

fun main() {


    var nullableName : String? = "Jon"

    var len2 = nullableName?.length
    // println(nullableName?.toLowerCase())
    nullableName?.let { println(it.length) }

    // if nullableName is empty --> use default "Guest"
    // ?: Elvis Operator
    val name = nullableName ?: "Guest"
    println("My name is $name")

    println(nullableName!!.toLowerCase())

    // val wifeAge: String? = user?.wife?.age ?: 0

}