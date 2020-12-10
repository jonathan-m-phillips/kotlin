//package com.example.helloworld
//
//fun main() {
//
//    var myCar = Car()
//    println("car brand: ${myCar.myBrand}")
//    myCar.maxSpeed = 200
//    println("max speed: ${myCar.maxSpeed}")
//    println("car model: ${myCar.myModel}")
//
//}
//
//
//class Car() {
//
//    // lateinit means it will be initialized later on
//    lateinit var owner : String
//
//    val myBrand : String = "BMW"
//        // Creating custom getter for myBrand
//    get() {
//        return field.toLowerCase()
//    }
//
//    var maxSpeed : Int = 150
//    // This code is automatically generated for us
//        get() = field
//        set(value){
//            field = if (value > 0) value else throw IllegalArgumentException("Max speed cannot be less than 0")
//        }
//
//    var myModel : String = "M5"
//        private set
//
//    init {
//        this.myModel = "M3"
//        this.owner = "Frank"
//    }
//
//}