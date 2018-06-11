package lista01

import java.util.Scanner

fun main(args: Array<String>) {
    var input = Scanner(System.`in`)

    var tempoSeg = input.nextInt()

    var horas = tempoSeg/3600
    var temp = tempoSeg%3600
    var minutos = temp/60
    var segundos = temp%60

    println("$horas:$minutos:$segundos")
}