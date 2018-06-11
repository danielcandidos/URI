package lista01

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val idadeDias = input.nextInt()

    System.out.printf("%d ano(s)\n", idadeDias/365)
    var temp = idadeDias%365

    System.out.printf("%d mes(es)\n", temp/30)
    temp %= 30

    System.out.printf("%d dia(s)\n", temp)
}