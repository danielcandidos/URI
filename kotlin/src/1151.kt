package lista04

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val num = input.nextInt()

    var n1 = 0
    var n2 = 1
    var n3: Int

    print("$n1 $n2")

    for (i in 2 until num) {
        n3 = n1 + n2
        print(" $n3")
        n1 = n2
        n2 = n3
    }
    println("")
}