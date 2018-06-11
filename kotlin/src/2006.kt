package lista06

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val realTea = input.nextInt()
    var numOfWinners = 0

    for (i in 1..5) {
        val response = input.nextInt()
        if (response == realTea) {
            numOfWinners++
        }
    }
    println(numOfWinners)
}