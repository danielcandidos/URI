package lista06

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val t1 = input.nextInt()
    val t2 = input.nextInt()
    val t3 = input.nextInt()
    val t4 = input.nextInt()

    val total = t1 + t2 + t3 + t4 - 3

    println(total)
}