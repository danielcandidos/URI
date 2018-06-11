package lista06

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val qtdCases = input.nextInt()

    for (i in 1..qtdCases) {
        val player1 = input.next()
        val choice1 = input.next()
        val player2 = input.next()
        val choice2 = input.next()

        val num1 = input.nextInt()
        val num2 = input.nextInt()

        if ((num1 + num2) % 2 == 0) {
            if (choice1 == "PAR") {
                println(player1)
            } else if (choice2 == "PAR") {
                println(player2)
            }
        } else {
            if (choice1 == "IMPAR") {
                println(player1)
            } else if (choice2 == "IMPAR") {
                println(player2)
            }
        }
    }
}