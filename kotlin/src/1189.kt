package lista05

import java.util.Scanner

fun main(args: Array<String>) {
    val LENGTH = 12
    val matrix = array2dOfdouble(LENGTH, LENGTH)
    val input = Scanner(System.`in`)

    val operacao = input.next()
    if ((operacao == "S") or (operacao == "M")) {
        var soma = 0.0

        for (i in 0..(LENGTH-1)) {
            for (j in 0..(LENGTH-1)) {
                matrix[i][j] = input.nextDouble()
                if (i != LENGTH - 1 - j) {
                    if ((i + j <= 10) and (i > j) and (i != j)) {
                        soma += matrix[i][j]
                    }
                }
            }
        }

        when (operacao) {
            "S" -> System.out.printf("%.1f\n", soma)
            "M" -> System.out.printf("%.1f\n", soma / 30.0)
        }
    }
}

private fun array2dOfdouble(sizeOuter: Int, sizeInner: Int): Array<DoubleArray>
        = Array(sizeOuter) { DoubleArray(sizeInner) }