package lista01

import java.util.Scanner
import kotlin.math.sqrt

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val x1 = input.nextDouble()
    val y1 = input.nextDouble()
    val x2 = input.nextDouble()
    val y2 = input.nextDouble()

    val a = x2 - x1
    val b = y2 - y1

    val distancia = sqrt(
            Math.pow(a, 2.0) + Math.pow(b, 2.0))

    System.out.printf("%.4f\n", distancia)
}