package lista04

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    while (true) {
        val num = input.nextInt()
        if (num == 0) break

        var soma = 0
        var i = num
        var k = 1

        while (k <= 5) {
            if (i % 2 == 0) {
                soma += i
                k++
            }
            i++
        }

        println(soma)
    }
}