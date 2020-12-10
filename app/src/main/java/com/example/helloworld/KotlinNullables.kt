package com.example.helloworld

fun main() {

    var name: String = "Jon"
    // name = null -> Compilation ERROR

    var nullableName : String? = "Jon"
    // nullableName = null
    // OR
    // var nullableName : String? = null

    var len = name.length
    var len2 = nullableName?.length
    // println(nullableName?.toLowerCase())
    nullableName?.let { println(it.length) }

    /*
    if (nullableName != null) {
        var len2 = nullableName.length
    } else {
        null
    }
     */




}