package lista04

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val num = input.nextInt()

    for (i in 1..num) {
        val x = input.nextInt()

        var soma = 0

        for (j in 1..x/2) {
            if (x % j == 0) soma += j
        }

        when (soma) {
            x -> println("$x eh perfeito")
            else -> println("$x nao eh perfeito")
        }
    }
}