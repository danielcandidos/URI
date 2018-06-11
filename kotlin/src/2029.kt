package lista06

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    while (input.hasNextDouble()) {
        val volume = input.nextFloat()
        val diameter = input.nextFloat()

        val radius = diameter/2
        val area = 3.14F * (radius * radius)
        val height = volume/area

        System.out.printf("ALTURA = %.2f\n", height)
        System.out.printf("AREA = %.2f\n", area)
    }
}