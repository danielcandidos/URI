package lista05

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    var matrixLength = 1

    while (matrixLength > 0) {
        matrixLength = input.nextInt()
        if (matrixLength > 0) {
            var matrix = array2dOfdouble(matrixLength, matrixLength)

            for (i in 0..(matrixLength - 1)) {
                for (j in 0..(matrixLength - 1)) {
                    matrix[i][j] = 0
                }
            }
            matrix = addSubMatrix(matrix, 0, matrixLength - 1)

            printMatrix(matrix, matrixLength)
        }
    }

}

private fun array2dOfdouble(sizeOuter: Int, sizeInner: Int): Array<IntArray>
        = Array(sizeOuter) { IntArray(sizeInner) }

private fun addSubMatrix(matrix: Array<IntArray>, start: Int, end: Int): Array<IntArray> {
    var newMatrix = matrix
    for (i in start..end) {
        for (j in start..end) {
            newMatrix[i][j] += 1

        }
    }
    if (end-1 > 0) {
        newMatrix = addSubMatrix(matrix, start+1, end-1)
    }
    return newMatrix
}

private fun printMatrix(matrix: Array<IntArray>, length: Int) {
    for (i in 0..(length-1)) {
        for (j in 0..(length - 1)) {
            val item = matrix[i][j]
            if (j == 0) {
                System.out.printf("%3d", item)
            } else {
                System.out.printf(" %3d", item)
            }
        }
        println()
    }
    println()
}