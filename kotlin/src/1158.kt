package lista04

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val num = input.nextInt()

    for (i in 1..num) {
        val x = input.nextInt()
        val qtd = input.nextInt()

        var j = x
        var soma = 0
        var cont = 0

        while (cont < qtd) {
            if (j % 2 != 0) {
                soma += j
                cont++
            }
            j++
        }
        println(soma)
    }
}