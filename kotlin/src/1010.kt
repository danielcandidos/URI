package lista01

import java.util.Scanner

fun main(args: Array<String>) {
    var input = Scanner(System.`in`)

    var peca1Id = input.nextInt()
    val peca1Qtd = input.nextInt()
    val peca1Valor = input.nextDouble()
    var peca2Id = input.nextInt()
    val peca2Qtd = input.nextInt()
    val peca2Valor = input.nextDouble()

    val total = (peca1Qtd * peca1Valor) + (peca2Qtd * peca2Valor)

    System.out.printf("VALOR A PAGAR: R$ %.2f\n", total)
}