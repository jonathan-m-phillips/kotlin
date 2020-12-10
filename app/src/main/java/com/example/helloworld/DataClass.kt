package com.example.helloworld

// primary constructor must have at least 1 parameter
data class User(val id: Long, var name: String)

fun main() {

    val user1 = User(1, "Jon")

//    val name = user1.name
//    println(name)
//    user1.name = "Michael"
//    println(user1.name)
    val user2 = User(1, "Michael")

    // this can be used instead of ==
    // println(user1.equals(user2))
    println(user1 == user2)

    println("User Details: $user1")

    val updatedUser = user1.copy(name="Jon Phillips")
    println(user1) // print User(id=1, name=Michael)
    println(updatedUser) // print User(id=1, name=Jon Phillips)

    println(updatedUser.component1()) // print 1
    println(updatedUser.component2()) // print Jon Phillips

    val (id, name) = updatedUser
    println("id=$id, name=$name") // print id=1, name=Jon Phillips
}