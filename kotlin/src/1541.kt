package lista05

import java.util.Scanner
import kotlin.math.roundToInt
import kotlin.math.sqrt
import kotlin.math.truncate

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    var largura = 10

    while (largura > 0) {
        largura = input.nextInt()
        if (largura > 0) {
            val comprimento = input.nextInt()
            val percentual = input.nextInt()

            val area = largura * comprimento
            val areaOcupada = sqrt(area / (percentual / 100.0))


            println(areaOcupada.roundToInt())
        }
    }
}