package lista04

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val num = input.nextInt()

    var fat = num

    for (i in num downTo 2) {
        fat *= (i - 1)
    }

    println(fat)
}