package lista01

import java.util.Scanner

fun main(args: Array<String>) {
    val pi = 3.14159
    val input = Scanner(System.`in`)

    val a = input.nextDouble()
    val b = input.nextDouble()
    val c = input.nextDouble()

    val triangulo = (a * c) /2
    val circulo = pi * (c * c)
    val trapezio = ((a + b) * c) / 2
    val quadrado = b * b
    val retangulo = a * b

    System.out.printf("TRIANGULO: %.3f\n", triangulo)
    System.out.printf("CIRCULO: %.3f\n", circulo)
    System.out.printf("TRAPEZIO: %.3f\n", trapezio)
    System.out.printf("QUADRADO: %.3f\n", quadrado)
    System.out.printf("RETANGULO: %.3f\n", retangulo)
}