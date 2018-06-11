package lista03

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    var alcool = 0
    var gaso = 0
    var diesel = 0

    while (true) {
        val x = input.nextInt()

        if (x !in 1..4) continue
        if (x == 4) break

        when (x) {
            1 -> alcool += 1
            2 -> gaso += 1
            3 -> diesel += 1
        }
    }
    println("MUITO OBRIGADO")
    println("Alcool: $alcool")
    println("Gasolina: $gaso")
    println("Diesel: $diesel")
}