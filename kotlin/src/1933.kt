package lista06

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val a = input.nextInt()
    val b = input.nextInt()

    if (a >= b) {
        println(a)
    } else {
        println(b)
    }
}