package lista02

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val num = input.nextInt()

    for (i in 1..num){
        if (i % 2 == 0){
            val quadrado = i*i
            println("$i^2 = $quadrado")
        }
    }
}