package lista05

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    while (input.hasNextInt()) {
        val matrixLength = input.nextInt()

        val matrix = intMatrix(matrixLength, matrixLength)

        for (i in 0 until matrixLength) {
            for (j in 0 until matrixLength) {
                if (matrixLength / 2 == i && matrixLength / 2 == j) {
                    matrix[i][j] = 4
                } else if (
                        i >= matrixLength / 3 &&
                        j >= matrixLength / 3 &&
                        matrixLength - i > matrixLength / 3 &&
                        matrixLength - j > matrixLength / 3
                ) {
                    matrix[i][j] = 1
                } else if (i == j) {
                    matrix[i][j] = 2
                } else if (i == matrixLength - 1 - j) {
                    matrix[i][j] = 3
                } else {
                    matrix[i][j] = 0
                }
            }
        }
        printMatrix(matrix, matrixLength)
    }
}

private fun intMatrix(sizeOuter: Int, sizeInner: Int): Array<IntArray>
        = Array(sizeOuter) { IntArray(sizeInner) }

private fun printMatrix(matrix: Array<IntArray>, length: Int) {
    for (i in 0..(length-1)) {
        for (j in 0..(length - 1)) {
            print(matrix[i][j])
        }
        println()
    }
    println()
}