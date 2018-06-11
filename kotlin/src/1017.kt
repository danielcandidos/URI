package lista01

import java.util.Scanner

fun main(args: Array<String>) {
    var consumoKml = 12
    var input = Scanner(System.`in`)

    var tempoHrs = input.nextInt()
    var velMediaKmh = input.nextInt()

    var distanciaKm = tempoHrs * velMediaKmh
    var consumoLitros = distanciaKm.toFloat() / consumoKml.toFloat()

    System.out.printf("%.3f\n", consumoLitros)
}