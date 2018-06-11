package lista06

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val num = input.nextLong()

    val numString = num.toString()
    var numInverted = ""

    for (i in numString.length-1 downTo 0) {
        numInverted += numString[i]
    }

    println(numInverted)
}