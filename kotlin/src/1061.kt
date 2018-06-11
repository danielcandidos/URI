package lista02

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    input.next()
    var diaInicio =input.nextInt()

    var horaInicio =input.nextInt()
    input.next()
    var minutoInicio =input.nextInt()
    input.next()
    var segundoInicio =input.nextInt()

    input.next()
    val diaFim =input.nextInt()

    val horaFim =input.nextInt()
    input.next()
    val minutoFim =input.nextInt()
    input.next()
    val segundoFim =input.nextInt()

    var isHora = false
    var isMinuto = false
    var isSegundo = false

    if (horaInicio > horaFim) {
        isHora = true
    }
    if (minutoInicio > minutoFim) {
        isMinuto = true
    }
    if (segundoInicio > segundoFim) {
        isSegundo = true
    }

    var dias = 0
    while (diaInicio != diaFim) {
        dias++
        diaInicio++
    }

    var horas = 0
    while (horaInicio != horaFim) {
        horas++
        horaInicio++
        if(horaInicio == 25)
            horaInicio = 1
    }

    var minutos = 0
    while(minutoInicio != minutoFim)  {
        minutos++
        minutoInicio++
        if(minutoInicio == 61)
            minutoInicio = 1
    }

    var segundos = 0
    while(segundoInicio != segundoFim)  {
        segundos++
        segundoInicio++
        if(segundoInicio == 61)
            segundoInicio = 1
    }

    if (isHora) {
        dias--
    }
    if (isMinuto) {
        horas--
    }
    if (isSegundo) {
        minutos--
    }

    println("$dias dia(s)")
    println("$horas hora(s)")
    println("$minutos minuto(s)")
    println("$segundos segundo(s)")
}