package lista06

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val x = input.nextDouble()

    var scNot = String.format("%.4e", x).toUpperCase()

    if (scNot.substring(0, 1) != "-") {
        scNot = "+$scNot"
    }

    println(scNot)
}