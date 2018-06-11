package lista04

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val par = IntArray(5)
    var parPos = 0
    val impar = IntArray(5)
    var impPos = 0

    for (i in 1..15) {
        val x = input.nextInt()

        if (x % 2 == 0) {
            par[parPos] = x
            parPos++
        } else {
            impar[impPos] = x
            impPos++
        }

        if ((impPos == 5) or (i == 15)) {
            for (k in 0 until impPos) {
                println("impar[$k] = " + impar[k])
            }
            impPos = 0
        }

        if ((parPos == 5) or (i == 15)) {
            for (k in 0 until parPos) {
                println("par[$k] = " + par[k])
            }
            parPos = 0
        }
    }
}