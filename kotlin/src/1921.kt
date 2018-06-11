package lista06

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val sides = input.nextLong()

    if (sides >= 3) {
        val diagonals = (sides * (sides - 3)) / 2
        println(diagonals)
    }
}