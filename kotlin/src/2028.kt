package lista06

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    var aux: Int
    var c = 0
    var num = 1
    while (input.hasNext()) {
        val n = input.nextInt()

        c++

        for (i in 1..n) {
            aux = i
            for (j in 0 until aux) {
                num++
            }
        }

        if (n == 0) {
            println("Caso $c: $num numero")
        } else {
            println("Caso $c: $num numeros")
        }

        print("0")
        for (i in 1..n) {
            aux = i
            for (j in 0 until aux) {
                    print(" $i")
            }
        }

        println()
        println()
        num = 1
    }
}