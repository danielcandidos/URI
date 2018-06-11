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

    var sum = 0

    for (i in a..b){
        if (i % 13 != 0) sum += i
    }

    println(sum)
}