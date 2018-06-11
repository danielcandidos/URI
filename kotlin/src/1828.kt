package lista05

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val qtd = input.nextInt()

    for (i in 1..qtd) {
        val jogada1 = input.next()
        val jogada2 = input.next()
        var vencedor: String

        vencedor = when {
            jogada1 == jogada2 -> "empate"
            ((jogada1 == "tesoura") and (jogada2 == "papel")) or
                    ((jogada1 == "papel") and (jogada2 == "pedra")) or
                    ((jogada1 == "pedra") and (jogada2 == "lagarto")) or
                    ((jogada1 == "lagarto") and (jogada2 == "Spock")) or
                    ((jogada1 == "Spock") and (jogada2 == "tesoura")) or
                    ((jogada1 == "tesoura") and (jogada2 == "lagarto")) or
                    ((jogada1 == "lagarto") and (jogada2 == "papel")) or
                    ((jogada1 == "papel") and (jogada2 == "Spock")) or
                    ((jogada1 == "Spock") and (jogada2 == "pedra")) or
                    ((jogada1 == "pedra") and (jogada2 == "tesoura")) -> "Sheldon"
            else -> "Raj"
        }

        when (vencedor) {
            "Sheldon" -> println("Caso #$i: Bazinga!")
            "Raj" -> println("Caso #$i: Raj trapaceou!")
            "empate" -> println("Caso #$i: De novo!")
        }
    }
}