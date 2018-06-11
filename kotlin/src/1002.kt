package lista01

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val raio = input.nextDouble()
    val a = 3.14159 * raio * raio
    System.out.printf("A=%.4f\n", a)
}