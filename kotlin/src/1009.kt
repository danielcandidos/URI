package lista01

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    var nome = input.next()
    val salario = input.nextDouble()
    val vendas = input.nextDouble()

    val total = salario + (vendas * 0.15)

    System.out.printf("TOTAL = R\$ %.2f\n", total)
}