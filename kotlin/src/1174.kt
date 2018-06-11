package lista04

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val list = arrayOfNulls<Float>(100)

    for (i in 0..99) {
        val num = input.nextFloat()
        list[i] = num
    }

    for (i in 0..99) {
        if (list[i]!! <= 10.0) {
            val item = list[i]
            System.out.printf("A[$i] = %.1f\n", item)
        }
    }
}