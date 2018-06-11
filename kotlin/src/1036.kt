package lista01

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val a = input.nextDouble()
    val b = input.nextDouble()
    val c = input.nextDouble()

    val delta = (b * b) - 4 * a * c

    when {
        a == 0.0 -> println("Impossivel calcular")
        delta > 0 -> {
            val x1 = ((-b + Math.sqrt(delta)) / (2 * a))
            val x2 = ((-b - Math.sqrt(delta)) / (2 * a))
            System.out.printf("R1 = %.5f\n", x1)
            System.out.printf("R2 = %.5f\n", x2)
        }
        else -> println("Impossivel calcular")
    }
}