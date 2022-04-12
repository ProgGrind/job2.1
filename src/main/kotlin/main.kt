package ru.netology

import kotlin.math.roundToInt

fun main() {
    print("Please type your payment amount: ")
    val money = readLine()?. toInt() ?: return
    val amount = money * 100
    val commission = amount * 0.0075
    val kop = (commission % 100).roundToInt()
    val rubles = (commission / 100).roundToInt()
    val result = if (commission > 3500)
        "$rubles рублей $kop копеек"
    else "35 рублей 0 копеек"
    println("Your commission: $result")

}