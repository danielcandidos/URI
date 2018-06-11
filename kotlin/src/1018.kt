package lista01

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val valor = input.nextInt()

    println("$valor")

    System.out.printf("%d nota(s) de R$ 100,00\n", valor/100)
    var temp = valor%100

    System.out.printf("%d nota(s) de R$ 50,00\n", temp/50)
    temp %= 50

    System.out.printf("%d nota(s) de R$ 20,00\n", temp/20)
    temp %= 20

    System.out.printf("%d nota(s) de R$ 10,00\n", temp/10)
    temp %= 10

    System.out.printf("%d nota(s) de R$ 5,00\n", temp/5)
    temp %= 5

    System.out.printf("%d nota(s) de R$ 2,00\n", temp/2)
    temp %= 2

    System.out.printf("%d nota(s) de R$ 1,00\n", temp/1)
}