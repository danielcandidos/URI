package lista06

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val qtd = input.nextInt()

    val students = IntArray(qtd)
    val scores = DoubleArray(qtd)

    for (i in 0 until qtd) {
        students[i] = input.nextInt()
        scores[i] = input.nextDouble()
    }

    val newScores = scores.clone()
    newScores.sort()

    if (newScores[qtd - 1] >= 8) {
        val pos = scores.indexOf(newScores[qtd - 1])
        println(students[pos])
    } else {
        println("Minimum note not reached")
    }
}