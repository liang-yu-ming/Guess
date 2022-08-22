package com.example.guess

import java.util.Random

class SecretNumber {
    val secretNum : Int = Random().nextInt(10) + 1
    var count : Int = 0

    fun validate(number: Int) : Int {
        count ++
        return number - secretNum
    }
}

/*
fun main() {
    val secretNumber = SecretNumber()
    println("被隱藏的數字: " + secretNumber.secretNum)
    println("猜: ${3}, 與實際差: ${secretNumber.validate(3)}, 猜了${secretNumber.count}次")
}
 */