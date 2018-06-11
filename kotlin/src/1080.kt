package lista03

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    var bigNumValue = 0
    var bigNumPosition = 0

    for (i in 1..100) {
        val num = input.nextInt()
        if (num > bigNumValue) {
            bigNumValue = num
            bigNumPosition = i
        }
    }
    println(bigNumValue)
    println(bigNumPosition)
}