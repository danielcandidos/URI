package lista06

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val qtd = input.nextInt()

    for (i in 1..qtd) {
        val play1 = input.next()
        val play2 = input.next()

        if (play1 == "ataque" && play2 == "pedra")
            println("Jogador 1 venceu")
        else if (play1 == "pedra" && play2 == "ataque")
            println("Jogador 2 venceu")
        else if (play1 == "pedra" && play2 == "papel")
            println("Jogador 1 venceu")
        else if (play1 == "papel" && play2 == "pedra")
            println("Jogador 2 venceu")
        else if (play1 == "papel" && play2 == "ataque")
            println("Jogador 2 venceu")
        else if (play1 == "ataque" && play2 == "papel")
            println("Jogador 1 venceu")
        else if (play1 == "papel" && play2 == "papel")
            println("Ambos venceram")
        else if (play1 == "pedra" && play2 == "pedra")
            println("Sem ganhador")
        else if (play1 == "ataque" && play2 == "ataque")
            println("Aniquilacao mutua")
    }
}