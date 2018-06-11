package lista07

import java.util.Scanner

fun main(args: Array<String>) {
    val FACTORIALS = intArrayOf(1, 1, 2, 6, 24, 120)
    val input = Scanner(System.`in`)

    while (true) {
        val num = input.nextInt()
        if (num == 0) {
            break
        }
        val c = num.toString().toCharArray()
        var f = 0

        for (i in c.size downTo 1) {
            f += Character.getNumericValue(c[c.size - i]) * FACTORIALS[i]
        }
        println(f)
    }
}