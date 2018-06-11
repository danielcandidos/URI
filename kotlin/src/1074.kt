package lista02

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val qtd = input.nextInt()

    for (i in 1..qtd){
        val num = input.nextInt()

        if (num == 0) {
            println("NULL")
        } else {
            if (num % 2 == 0) {
                print("EVEN ")
            } else {
                print("ODD ")
            }
            if (num > 0) {
                println("POSITIVE")
            } else {
                println("NEGATIVE")
            }
        }
    }
}