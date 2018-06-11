package lista02

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val ddd = input.nextInt()

    var cidade = ""

    when (ddd) {
        61 -> cidade = "Brasilia"
        71 -> cidade = "Salvador"
        11 -> cidade = "Sao Paulo"
        21 -> cidade = "Rio de Janeiro"
        32 -> cidade = "Juiz de Fora"
        19 -> cidade = "Campinas"
        27 -> cidade = "Vitoria"
        31 -> cidade = "Belo Horizonte"
    }

    if (cidade != ""){
        println(cidade)
    } else {
        println("DDD nao cadastrado")
    }
}