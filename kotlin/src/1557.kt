package lista05

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    var matrixLength = 1

    while (matrixLength > 0) {
        matrixLength = input.nextInt()

        if (matrixLength > 0) {
            val maxDig = countDig(Math.pow(
                    2.0,
                    (2 * (matrixLength - 1)).toDouble()
            ).toInt())

            for (i in 0 until matrixLength) {
                for (j in 0 until matrixLength) {
                    System.out.printf(getStringFinal(
                            maxDig,
                            Math.pow(2.0, (i + j).toDouble()).toInt()
                    ))
                    if (j < matrixLength - 1) {
                        print(" ")
                    } else {
                        println()
                    }
                }
            }
            println()
        }
    }
}

private fun getStringFinal(dig: Int, x: Int): String {
    var resultado = x.toString() + ""
    for (i in 1..(dig - countDig(x))) {
        resultado = " $resultado"
    }
    return resultado
}

private fun countDig(x: Int): Int {
    var x1 = x
    var digitos = 0
    while (x1 > 0) {
        x1 /= 10
        digitos++
    }
    return digitos
}