package lista01

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val valor = input.nextFloat()

    when {
        valor > 100 -> println("Fora de intervalo")
        valor > 75 -> println("Intervalo (75,100]")
        valor > 50 -> println("Intervalo (50,75]")
        valor > 25 -> println("Intervalo (25,50]")
        valor >= 0 -> println("Intervalo [0,25]")
        else -> println("Fora de intervalo")
    }
}