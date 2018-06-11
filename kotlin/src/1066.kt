package lista02

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    var pares = 0
    var impares = 0
    var positivos = 0
    var negativos = 0

    for (i in 0..4) {
        val x = input.nextInt()

        if (x % 2 == 0) {
            pares += 1
        } else {
            impares += 1
        }

        if (x > 0) {
            positivos += 1
        } else if (x < 0) {
            negativos +=1
        }
    }

    println("$pares valor(es) par(es)")
    println("$impares valor(es) impar(es)")
    println("$positivos valor(es) positivo(s)")
    println("$negativos valor(es) negativo(s)")
}