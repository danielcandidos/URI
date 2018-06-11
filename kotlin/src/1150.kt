package lista04

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    var x = input.nextInt()
    var z: Int

    while (true) {
        z = input.nextInt()
        if (z > x) break
    }

    var qtd = 1

    for (i in x..z) {
        x += i
        qtd += 1
        if (x > z) break
    }

    println(qtd)
}