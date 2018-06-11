package lista04

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val num = input.nextInt()

    for (i in 1..num) {
        if (num % i == 0) {
            println(i)
        }
    }
}