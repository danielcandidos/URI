package lista01

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val nota1 = input.nextDouble()
    val nota2 = input.nextDouble()
    val media = ((nota1 * 3.5) + (nota2 * 7.5)) / (3.5 + 7.5)
    System.out.printf("MEDIA = %.5f\n", media)
}