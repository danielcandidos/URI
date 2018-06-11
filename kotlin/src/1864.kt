package lista05

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val num = input.nextInt()
    val msg = "LIFE IS NOT A PROBLEM TO BE SOLVED"

    println(msg.substring(0, num))
}