package lista04

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val a = input.nextInt()
    var n: Int

    while (true) {
        n = input.nextInt()
        if (n > 0) break
    }

    var soma = 0

    for (i in 0 until n) {
        soma += a + i
    }

    println(soma)
}