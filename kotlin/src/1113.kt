package lista03

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    while (true){
        val x = input.nextInt()
        val y = input.nextInt()

        if (x == y) break

        if (x > y){ println("Decrescente") }
        else{ println("Crescente") }
    }
}