package com.example.helloworld

// The class that inherits the features of another
//  class is called the Sub class or Child class or
//  Derived class, and the class whose features are inherited
//  is called the Super class or Parent class or Base class

// All classes in Kotlin are final by default -- non-inheritable by default
// Parent class needs to be open to be inherited
// If I want to make a class non-inheritable use the keyword 'sealed' instead of open
// Super class, Parent class, Base class -- of ElectricCar class
//open class Car(val name: String, val brand: String) {
//    open var range: Double = 0.0
//
//    fun extendRange(amount: Double) {
//        if (amount > 0) {
//            range += amount
//        }
//    }
//
//    open fun drive(distance: Double) {
//        println("Drove for $distance miles.")
//    }
//}
//
//// Sub class, Child class, Derived class -- of Car Class
//class ElectricCar(name: String, brand: String, batteryLife: Double) : Car(name, brand) {
//
//
//    var chargerType = "Type1"
//    override var range = batteryLife * 3
//
//    override fun drive(distance: Double) {
//        println("Drove for $distance miles on electricity")
//    }
//
//    fun drive() {
//        println("Drove for $range miles on electricity")
//    }
//
//}
//
//fun main() {
//
//    var audiA3 = Car("A3", "Audi")
//    var teslaS = ElectricCar("S-Model", "Tesla", 85.0)
//    teslaS.chargerType = "Type2"
//    teslaS.extendRange(150.0)
//
//    teslaS.drive()
//
//    // Polymorphism
//    audiA3.drive(200.0)
//    teslaS.drive(200.0)
//
//}