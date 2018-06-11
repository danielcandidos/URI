package lista03

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    while (true){
        val x = input.nextInt()
        val y = input.nextInt()

        if ((x == 0) or (y == 0)) break

        if ((x > 0) and (y > 0)){
            println("primeiro")
        } else if ((x < 0) && (y > 0)){
            println("segundo")
        } else if ((x < 0) && (y < 0)){
            println("terceiro")
        } else if ((x > 0) && (y < 0)){
            println("quarto")
        }
    }
}