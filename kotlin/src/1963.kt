package lista06

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val a = input.nextDouble()
    val b = input.nextDouble()

    val increase = b * 100 / a - 100

    System.out.printf("%.2f%%\n", increase)
}