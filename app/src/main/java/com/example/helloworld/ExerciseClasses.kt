package com.example.helloworld

fun main() {

    val iphone = MobilePhone("iOS", "Apple", "iPhone 12")
    val galaxyS20 = MobilePhone("Android","Samsung", "Galaxy S20")
    val mateXS = MobilePhone("Android", "Huawei", "Mate X S")

    iphone.chargeBattery(60)

}

class MobilePhone(osName: String, brand: String, model: String) {

    // Member variable properties
    private var battery = 30

    // Initializer block
    init {
        println("The phone $model from $brand uses $osName as its Operating System")
    }


    // Member method
    fun chargeBattery(chargedBy: Int) {
        println("Battery was at $battery% and is now at ${battery + chargedBy}%")
        battery += chargedBy
    }


}