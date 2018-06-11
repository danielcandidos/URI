package lista07

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val qtd = input.nextInt()

    for (i in 1..qtd) {
        val x = input.nextInt()
        val y = input.nextInt()

        println(calcMdc(x, y))
    }
}

fun calcMdc(a: Int, b: Int): Int {
    if ( a == 0 )
        return b
    return calcMdc(b % a, a )
}