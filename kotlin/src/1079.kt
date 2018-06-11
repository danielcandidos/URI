package lista03

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val num = input.nextInt()

    for (i in 1..num) {
        val a = input.nextDouble()
        val b = input.nextDouble()
        val c = input.nextDouble()

        val weighAverage = ((2*a) + (3*b) + (5*c)) / 10
        System.out.printf("%.1f\n", weighAverage)
    }
}