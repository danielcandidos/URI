package lista05

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    var matrixLength = 1

    while (matrixLength > 0) {
        matrixLength = input.nextInt()
        if (matrixLength > 0) {
            var matrix = array2dOfdouble(matrixLength+2, matrixLength+2)

            for (i in 0..(matrixLength)) {
                for (j in 0..(matrixLength)) {
                    matrix[i][j] = 0
                }
            }

            for (i in 1..(matrixLength)) {
                for (j in 1..(matrixLength)) {
                    if (i==j){
                        matrix[i][j] = 1
                    } else {
                        matrix[i][j] =  matrix[i][j-1] + 1
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
    for (i in 1..(length)) {
        for (j in 1..(length)) {
            if (i > j) {
                matrix[i][j] = matrix[j][i]
            }
            val item = matrix[i][j]
            if (j == 1) {
                System.out.printf("%3d", item)
            } else {
                System.out.printf(" %3d", item)
            }
        }
        println()
    }
    println()
}