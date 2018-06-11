package lista04

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val list = arrayOfNulls<Int>(20)

    for (i in 0..19) {
        val num = input.nextInt()
        list[19-i] = num
    }

    for (i in 0..19) {
        val item = list[i]
        println("N[$i] = $item")
    }
}