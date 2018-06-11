package lista02

import java.util.*

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val horaInicial = input.nextInt()
    val minInicial = input.nextInt()
    val horaFinal = input.nextInt()
    val minFinal = input.nextInt()

    var duracaoHora = when {
        (horaFinal > horaInicial) -> horaFinal - horaInicial
        (horaFinal == horaInicial) -> 24
        else -> (24 - horaInicial) + horaFinal
    }

    val duracaoMin: Int

    when {
        minFinal > minInicial -> duracaoMin = minFinal - minInicial
        minFinal == minInicial -> duracaoMin = 0
        else -> {
            duracaoMin = (60 - minInicial) + minFinal
            duracaoHora -= 1
        }
    }

    println("O JOGO DUROU $duracaoHora HORA(S) E $duracaoMin MINUTO(S)")
}