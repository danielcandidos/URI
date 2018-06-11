package lista05

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val a = input.nextInt()
    val b = input.nextInt()
    val c = input.nextInt()

    when {
        (a > b) and (b <= c) -> println(":)")
        (a < b) and (b >= c) -> println(":(")
        (b in (a + 1)..(c - 1)) and (c - b < b - a) -> println(":(")
        (b in (a + 1)..(c - 1)) and (c - b >= b - a) -> println(":)")
        (b in (c + 1)..(a - 1)) and (c - b > b - a) -> println(":)")
        (b in (c + 1)..(a - 1)) and (c - b <= b - a) -> println(":(")
        (a == b) and (b < c) -> println(":)")
        else -> println(":(")
    }
}