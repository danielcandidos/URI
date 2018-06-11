package lista03

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val num = input.nextInt()

    for (i in 0 until num) {
        val a = 1 + (i *4)
        val b = a + 1
        val c = b + 1
        println("$a $b $c PUM")
    }
}