package lista07

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val qtd = input.nextInt()

    for (i in 1..qtd) {
        val s = input.next()
        val a = Character.getNumericValue(s[0])
        val b = Character.getNumericValue(s[2])
        when {
            a == b -> println(a * b)
            Character.isLowerCase(s[1]) -> println(a + b)
            else -> println(b - a)
        }
    }
}