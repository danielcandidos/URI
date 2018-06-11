package lista04

import java.util.Scanner
import kotlin.math.pow

fun main(args: Array<String>) {
    val list = arrayOfNulls<Int>(10)

    val input = Scanner(System.`in`)
    val num = input.nextInt()

    for (i in 0..9) {
        list[i] = num * 2.0.pow(i).toInt()
    }

    for (i in 0..9) {
        val item = list[i]
        println("N[$i] = $item")
    }
}