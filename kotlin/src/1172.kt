package lista04

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val list = mutableListOf(1,1,1,1,1,1,1,1,1,1)

    for (i in 0..9) {
        val num = input.nextInt()
        if (num > 0) {
            list[i] = num
        }
    }

    for (i in 0..9) {
        val item = list[i]
        println("X[$i] = $item")
    }
}
