package lista07

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    while (input.hasNext()) {
        val x = input.nextLong()
        val y = input.nextLong()
        val resp = x xor y
        println(resp)
    }
}