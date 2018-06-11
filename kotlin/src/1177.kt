package lista04

import java.util.Scanner

fun main(args: Array<String>) {
    val list = IntArray(1000)

    val input = Scanner(System.`in`)
    val t = input.nextInt()

    var j = 0
    for (i in 0 until 1000) {
        list[j] = j

        if (list[j] == t) {
            j = 0
        }
        val item = list[j]
        println("N[$i] = $item")
        j++
    }
}