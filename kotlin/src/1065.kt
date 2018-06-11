package lista02

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    var pares = 0

    for (i in 0..4) {
        val x = input.nextInt()
        if (x % 2 == 0) {
            pares += 1
        }
    }
    println("$pares valores pares")
}