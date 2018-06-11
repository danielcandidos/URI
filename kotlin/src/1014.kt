package lista01

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val km = input.nextInt()
    val fuel = input.nextDouble()

    System.out.printf("%.3f km/l\n", km/fuel)
}