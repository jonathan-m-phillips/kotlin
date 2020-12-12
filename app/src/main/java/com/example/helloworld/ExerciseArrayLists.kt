package com.example.helloworld

fun main() {

    println(fiveNumbers(3.0, 29.5, 36.3, 98.7, 56.3))

}


fun fiveNumbers(num1: Double, num2: Double, num3: Double, num4: Double, num5: Double): Double {

    val arrayList = ArrayList<Double>()

    arrayList.add(num1)
    arrayList.add(num2)
    arrayList.add(num3)
    arrayList.add(num4)
    arrayList.add(num5)

    var sum = 0.0
    for (i in arrayList) {
        sum += i
    }

    return sum / arrayList.size
}