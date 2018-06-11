package lista04

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val num = input.nextInt()

    for (i in 1..num) {
        val x = input.nextInt()
        var primo = true

        for (j in 2 until x) {
            if (x % j == 0) {
                primo = false
                break
            }
        }

        if (primo) {
            println("$x eh primo")
        } else {
            println("$x nao eh primo")
        }
    }
}