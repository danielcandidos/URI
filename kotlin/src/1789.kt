package lista05

import java.util.Scanner
import kotlin.math.max

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    while (input.hasNextInt()) {
        val qtdLesmas = input.nextInt()

        if (qtdLesmas > 0) {
            var nivelMaximo = 0
            for (i in 1..qtdLesmas) {
                val lesmaNivel = input.nextInt()
                nivelMaximo = when {
                    lesmaNivel >= 20 -> max(nivelMaximo, 3)
                    lesmaNivel >= 10 -> max(nivelMaximo, 2)
                    else -> max(nivelMaximo, 1)
                }
            }
            println(nivelMaximo)
        }
    }
}