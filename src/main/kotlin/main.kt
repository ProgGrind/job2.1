package ru.netology

fun main() {
    print("Please type your payment amount: ")
    val amount = readLine()?. toInt() ?: return
    val commission = amount * 0.0075f
    val result = if (commission > 35)
        commission
    else 35
    println("Your commission: $result")

}