package lista02

import java.util.*

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val x = input.nextFloat()
    val y = input.nextFloat()

    if (x.equals(0.0F) && y.equals(0.0F)){
        println("Origem")
    } else if (x.equals(0.0F)){
        println("Eixo Y")
    } else if (y.equals(0.0F)){
        println("Eixo X")
    } else {
        if ((x > 0) && (y > 0)){
            println("Q1")
        } else if ((x > 0) && (y < 0)){
            println("Q4")
        } else if ((x < 0) && (y > 0)){
            println("Q2")
        } else if ((x < 0) && (y < 0)){
            println("Q3")
        }
    }
}