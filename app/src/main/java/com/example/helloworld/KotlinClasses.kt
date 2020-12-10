package com.example.helloworld

fun main() {

    // Creating instance of class
    val jon = Person("Jon", "Phillips", 30)
    jon.hobby = "writing code"
    jon.age = 31
    jon.stateHobby()

}


class Person (firstName: String = "John", lastName: String = "Doe"){

    // Member variable - Properties
    var age : Int? = null
    var hobby : String? = "watching Netflix"
    var firstName : String? = null

    // Initializer Block
    init {
        this.firstName = firstName
        println("Initialized a new Person object with " +
                "firstName = $firstName and lastName = $lastName")
    }

    //Member secondary Constructor
    constructor(firstName: String = "John", lastName: String = "Doe", age: Int)
        : this(firstName, lastName) {
            this.age = age
        println("Initialized a new Person object with " +
                "firstName = $firstName, lastName = $lastName, and age $age")
        }

    // Member functions - Methods
    fun stateHobby() {
        println("$firstName\'s hobby is $hobby")
    }

}