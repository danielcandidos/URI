package lista06

import java.util.Scanner
import kotlin.math.abs

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val a = input.nextInt()
    val b = input.nextInt()
    val c = input.nextInt()
    val d = input.nextInt()

    if (
        (
            (abs(b - c) < a && a < (b + c)) &&
            (abs(a - c) < b && b < (a + c)) &&
            (abs(b - a) < c && c < (b + a))
        ) ||
        (
            (abs(b - c) < d && d < (b + c)) &&
            (abs(d - c) < b && b < (d + c)) &&
            (abs(b - d) < c && c < (b + d))
        ) ||
        (
            (abs(b - d) < a && a < (b + d)) &&
            (abs(a - d) < b && b < (a + d)) &&
            (abs(b - a) < d && d < (b + a))
        ) ||
        (
            (abs(c - d) < a && a < (b + d)) &&
            (abs(a - d) < c && c < (a + d)) &&
            (abs(c - a) < d && d < (c + a))
        )
     ){
        println("S")
    } else {
        println("N")
    }
}