package lista06

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val numSides = input.nextLong()
    val length = input.nextLong()

    if (numSides in 3..1000000 && length in 1..4000){
        println(numSides * length)
    }
}