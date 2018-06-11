package lista04

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val num = input.nextInt()

    for (i in 1..num) {
        var maxAnos = 101

        var popA = input.nextInt()
        var popB = input.nextInt()

        val crescA = input.nextFloat()
        val crescB = input.nextFloat()

        for (j in 0..99) {
            popA = ((1 + (crescA / 100)) * popA).toInt()
            popB = ((1 + (crescB / 100)) * popB).toInt()
            if (popA > popB) {
                maxAnos = j + 1
                break
            }
        }
        if (maxAnos > 100) {
            println("Mais de 1 seculo.")
        } else {
            println("$maxAnos anos.")
        }
    }
}