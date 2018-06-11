package lista01

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val a = input.nextInt()
    val b = input.nextInt()
    val c = input.nextInt()
    val d = input.nextInt()

    var aceito = false
    if (b > c && d > a){
        val somaCD = c + d
        val somaAB = a + b
        if (somaCD > somaAB){
            if (c >= 0 && d >= 0){
                if ((a % 2) == 0){
                    aceito = true
                    println("Valores aceitos")
                }
            }
        }
    }

    if (!aceito){
        println("Valores nao aceitos")
    }
}