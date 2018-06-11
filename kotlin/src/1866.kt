package lista06

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val qtdCases = input.nextInt()

    for (i in 1..qtdCases) {
        val qtdTerms = input.nextInt()

        if (qtdTerms % 2 == 0) {
            println(0)
        } else {
            println(1)
        }
    }
}