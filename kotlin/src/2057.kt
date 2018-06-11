package lista06

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val numbers = IntArray(3)
    for (i in 0..2) {
        numbers[i] = input.nextInt()
    }

    val hour = numbers[0] + numbers[1] + numbers[2]

    when {
        hour == 24 -> println(0)
        hour > 24 -> println(hour - 24)
        hour < 0 -> println(24 + hour)
        else -> println(hour)
    }
}