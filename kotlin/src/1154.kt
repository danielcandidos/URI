package lista04

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    var total = 0
    var qtd = 0

    while (true) {
        val idade = input.nextInt()
        if (idade < 0) break
        total += idade
        qtd += 1
    }

    val media = total / qtd.toFloat()
    System.out.printf("%.2f\n", media)
}