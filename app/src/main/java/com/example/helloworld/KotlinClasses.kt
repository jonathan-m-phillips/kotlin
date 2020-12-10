package com.example.helloworld

fun main() {

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