package lista03

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val x = input.nextInt()
    val y = input.nextInt()

    var a = x; var b = y

    if (x > y) {
        a = y; b = x
    }

    for (i in a+1 until b){
        if ((i % 5 == 2) or (i % 5 == 3)) {
            println(i)
        }
    }
}