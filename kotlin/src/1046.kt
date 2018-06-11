package lista02

import java.util.*

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val horaInicial = input.nextInt()
    val horaFinal = input.nextInt()

    val duracao = when {
        (horaFinal > horaInicial) -> horaFinal - horaInicial
        (horaFinal == horaInicial) -> 24
        else -> (24 - horaInicial) + horaFinal
    }

    println("O JOGO DUROU $duracao HORA(S)")
}