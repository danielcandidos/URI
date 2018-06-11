package lista04

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val tamanho = input.nextInt()

    val list = IntArray(tamanho)

    for (i in 0 until tamanho) {
        list[i] = input.nextInt()
    }

    println("Menor valor: "+list.min())
    println("Posicao: "+list.indexOf(list.min()!!))
}