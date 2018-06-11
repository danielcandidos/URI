package lista03

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val num = input.nextInt()

    for (i in 1..num) {
        val quadrado = i*i
        val cubo = quadrado * i
        println("$i $quadrado $cubo")
    }
}