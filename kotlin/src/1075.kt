package lista03

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val num = input.nextInt()

    for (i in 1..10000){
        if (i % num == 2) {
            println(i)
        }
    }
}