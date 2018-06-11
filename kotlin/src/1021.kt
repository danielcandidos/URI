package lista01

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val valor = input.nextDouble()
    val valorInt = valor.toInt()

    println("NOTAS:")
    System.out.printf("%d nota(s) de R$ 100.00\n", valorInt/100)
    var temp = valorInt%100
    System.out.printf("%d nota(s) de R$ 50.00\n", temp/50)
    temp %= 50
    System.out.printf("%d nota(s) de R$ 20.00\n", temp/20)
    temp %= 20
    System.out.printf("%d nota(s) de R$ 10.00\n", temp/10)
    temp %= 10
    System.out.printf("%d nota(s) de R$ 5.00\n", temp/5)
    temp %= 5
    System.out.printf("%d nota(s) de R$ 2.00\n", temp/2)
    temp %= 2

    println("MOEDAS:")
    System.out.printf("%d moeda(s) de R$ 1.00\n", temp/1)

    val moeda50 = (valor % 100 % 50 % 20 % 5 % 2 % 1 / .5).toInt()
    val moeda25 = (valor % 100 % 50 % 20 % 5 % 2 % 1 % .5 / .25).toInt()
    val moeda10 = (valor % 100 % 50 % 20 % 5 % 2 % 1 % .5 % .25 / .1).toInt()
    val moeda05 = (valor % 100 % 50 % 20 % 5 % 2 % 1 % .5 % .25 % .1 / .05).toInt()
    val moeda01 = (valor % 100 % 50 % 20 % 5 % 2 % 1 % .5 % .25 % .1 % .05 / .01).toInt()

    System.out.printf("%d moeda(s) de R$ 0.50\n", moeda50)
    System.out.printf("%d moeda(s) de R$ 0.25\n", moeda25)
    System.out.printf("%d moeda(s) de R$ 0.10\n", moeda10)
    System.out.printf("%d moeda(s) de R$ 0.05\n", moeda05)
    System.out.printf("%d moeda(s) de R$ 0.01", moeda01)
}
