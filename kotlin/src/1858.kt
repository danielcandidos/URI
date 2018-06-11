package lista05

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val qtd = input.nextInt()

    var min = 21
    var response = 0

    for (i in 1..qtd) {
        val x = input.nextInt()

        if (min > x) {
            min = x
            response = i
        }
    }
    println(response)
}