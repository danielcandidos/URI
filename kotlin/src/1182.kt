package lista04

import java.util.Scanner

fun main(args: Array<String>) {
    val matrix = array2dOfdouble(12, 12)

    val input = Scanner(System.`in`)

    val linha = input.nextInt()
    val operacao = input.next()

    for (i in 0..11) {
        for (j in 0..11) {
            matrix[j][i] = input.nextDouble()
        }
    }

    when (operacao) {
        "S" -> System.out.printf("%.1f\n", matrix[linha].sum())
        "M" -> System.out.printf("%.1f\n", matrix[linha].average())
    }
}

private fun array2dOfdouble(sizeOuter: Int, sizeInner: Int): Array<DoubleArray>
        = Array(sizeOuter) { DoubleArray(sizeInner) }