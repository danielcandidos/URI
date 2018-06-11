package lista03

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val x = input.nextInt()
    val y = input.nextInt()

    if ((x > 1) and (x < 20) and (y > x) and (y < 100000)) {
        for (i in 1..y step x) {
            for (j in i until (i+x)) {
                if (j == i){ print(j) }
                else { print(" $j") }
            }
            println()
        }
    }
}