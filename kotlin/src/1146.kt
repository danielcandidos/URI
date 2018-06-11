package lista04

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    while (true){
        val num = input.nextInt()

        if (num == 0) break

        for (i in 1..num){
            when (i) {
                num -> println(i)
                else -> print("$i ")
            }
        }
    }
}