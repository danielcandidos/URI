package lista02

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val num = input.nextInt()

    for (i in 0..num){
        if (i % 2 != 0){
            println(i)
        }
    }
}