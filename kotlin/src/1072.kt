package lista02

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val qtd = input.nextInt()

    var qtdDentro = 0
    var qtdFora = 0

    for (i in 1..qtd){
        val num = input.nextInt()

        when (num) {
            in 10..20 -> qtdDentro++
            else -> qtdFora++
        }
    }

    println("$qtdDentro in")
    println("$qtdFora out")
}