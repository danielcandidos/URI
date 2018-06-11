package lista05

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val numHo = input.nextInt()

    if (numHo > 0) {
        for (i in 1..numHo) {
            if (i == 1) {
                print("Ho")
            } else {
                print(" Ho")
            }
        }
        println("!")
    }
}