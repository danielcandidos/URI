package lista03

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val numTests = input.nextInt()

    var cobaiasCoelhos = 0
    var cobaiasRatos = 0
    var cobaiasSapos = 0

    for (i in 1..numTests) {
        val cobaias = input.nextInt()
        if (cobaias in 1..15) {
            val type = input.next()
            when (type) {
                "C" -> cobaiasCoelhos += cobaias
                "R" -> cobaiasRatos += cobaias
                "S" -> cobaiasSapos += cobaias
            }
        }
    }

    val cobaiasTotal = cobaiasCoelhos + cobaiasRatos + cobaiasSapos

    println("Total: $cobaiasTotal cobaias")
    println("Total de coelhos: $cobaiasCoelhos")
    println("Total de ratos: $cobaiasRatos")
    println("Total de sapos: $cobaiasSapos")
    System.out.printf(
            "Percentual de coelhos: %.2f %%\n",
            cobaiasCoelhos/cobaiasTotal.toFloat()*100)
    System.out.printf(
            "Percentual de ratos: %.2f %%\n",
            cobaiasRatos/cobaiasTotal.toFloat()*100)
    System.out.printf(
            "Percentual de sapos: %.2f %%\n",
            cobaiasSapos/cobaiasTotal.toFloat()*100)
}