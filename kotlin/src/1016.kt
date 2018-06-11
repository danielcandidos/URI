package lista01

import java.util.Scanner

fun main(args: Array<String>) {
    val distanciaMin = 2
    val input = Scanner(System.`in`)

    val distanciaKm = input.nextInt()
    val tempo = distanciaKm * distanciaMin

    println("$tempo minutos")
}