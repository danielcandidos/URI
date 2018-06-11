package lista06

import java.util.Scanner
import kotlin.math.abs

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val qtd = input.nextInt()

    for (i in 0 until qtd) {
        val t = input.nextInt()

        val result = 2015 - t

        if (result < 0 || result == 0) {
            val year = abs(result - 1)
            println("$year A.C.")
        } else {
            println("$result D.C.")
        }
    }
}