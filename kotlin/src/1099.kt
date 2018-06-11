package lista03

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val num = input.nextInt()

    for (i in 1..num){
        val x = input.nextInt()
        val y = input.nextInt()
        var a = x
        var b = y

        if (x > y) {
            a = y
            b = x
        }

        var somaImpares = 0
        for (j in a+1 until b){
            if (j % 2 != 0) {
                somaImpares += j
            }
        }
        println(somaImpares)
    }
}