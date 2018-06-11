package lista05

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val qtd = input.nextInt()

    for (i in 1..qtd) {
        val hero = input.next()
        input.nextInt()

        if (hero == "Thor") {
            println("Y")
        } else {
            println("N")
        }
    }
}