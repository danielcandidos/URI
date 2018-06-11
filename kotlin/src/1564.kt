package lista05

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    while (input.hasNextInt()) {
        val numReclamacoes = input.nextInt()
        if (numReclamacoes == 0) {
            println("vai ter copa!")
        } else if (numReclamacoes > 0) {
            println("vai ter duas!")
        }
    }
}