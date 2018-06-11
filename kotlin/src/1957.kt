package lista06

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val v = input.nextLong()

    val hexString = java.lang.Integer.toHexString(v.toInt())
    println(hexString.toUpperCase())
}