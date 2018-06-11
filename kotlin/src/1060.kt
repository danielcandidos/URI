package lista02

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    var positivos = 0

    for (i in 0..5) {
        val x = input.nextDouble()
        if (x > 0) {
            positivos += 1
        }
    }
    println("$positivos valores positivos")
}