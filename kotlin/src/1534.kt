package lista05

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    while (input.hasNextInt()) {
        val matrixLength = input.nextInt()
        if (matrixLength > 0) {
            val matrix = array2dOfdouble(matrixLength, matrixLength)

            for (i in 0..(matrixLength - 1)) {
                for (j in 0..(matrixLength - 1)) {
                    when (i) {
                        matrixLength - 1 - j -> matrix[i][j] = 2
                        j -> matrix[i][j] = 1
                        else -> matrix[i][j] = 3
                    }
                }
            }
            printMatrix(matrix, matrixLength)
        }

    }

}

private fun array2dOfdouble(sizeOuter: Int, sizeInner: Int): Array<IntArray>
        = Array(sizeOuter) { IntArray(sizeInner) }

private fun printMatrix(matrix: Array<IntArray>, length: Int) {
    for (i in 0..(length-1)) {
        for (j in 0..(length-1)) {
            print(matrix[i][j])
        }
        println()
    }
}