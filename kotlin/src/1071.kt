package lista02

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val x = input.nextInt()
    val y = input.nextInt()
    val a: Int
    val b: Int
    var somaImpares = 0

    if (x < y) {
        a = x
        b = y
    } else {
        a = y
        b = x
    }

    for (i in a+1 until b){
        if (i % 2 != 0) {
            somaImpares += i
        }
    }

    println(somaImpares)
}