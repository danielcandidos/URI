package lista03

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val num = input.nextInt()

    if (num in 3..999){

        for (i in 1..10) {
            val multi = i * num
            println("$i x $num = $multi")
        }

    }
}