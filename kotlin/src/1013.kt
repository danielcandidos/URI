package lista01

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val a = input.nextInt()
    val b = input.nextInt()
    val c = input.nextInt()

    var maior = a
    if ((a < b) || (a < c)){
        maior = if (b > c){
            b
        } else {
            c
        }
    }

    println("$maior eh o maior")
}