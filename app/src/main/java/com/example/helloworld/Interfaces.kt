package com.example.helloworld


interface Driveable{
    val maxSpeed: Double
    fun drive(): String
    fun brake(){
        println("The driveable is braking")
    }
}
open class Car(override val maxSpeed: Double, val name: String, val brand: String): Driveable {
    open var range: Double = 0.0

    fun extendRange(amount: Double) {
        if (amount > 0) {
            range += amount
        }
    }

    // this is a shorter version of the override
    // override fun drive(): String = "driving the interface drive"

    // this is another option
    override fun drive(): String {
        return "driving the interface drive"
    }

    open fun drive(distance: Double) {
        println("Drove for $distance miles.")
    }
}

// Sub class, Child class, Derived class -- of Car Class
class ElectricCar(maxSpeed: Double, name: String, brand: String, batteryLife: Double) : Car(maxSpeed, name, brand) {


    var chargerType = "Type1"
    override var range = batteryLife * 3

    override fun drive(distance: Double) {
        println("Drove for $distance miles on electricity")
    }

    override fun drive(): String {
        return "Drove for $range miles on electricity"
    }

    override fun brake() {
        super.brake() // --> print "The driveable is braking
        println("Brake inside of electric car")
    }

}

fun main() {

    var audiA3 = Car(180.0,"A3", "Audi")
    var teslaS = ElectricCar(200.0,"S-Model", "Tesla", 85.0)
    teslaS.chargerType = "Type2"
    teslaS.extendRange(150.0)

    teslaS.drive()
    teslaS.brake()

    audiA3.brake()

    // Polymorphism
    audiA3.drive(200.0)
    teslaS.drive(200.0)

}