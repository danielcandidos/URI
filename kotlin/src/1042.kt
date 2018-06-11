package lista02

import java.util.*

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val a = input.nextInt()
    val b = input.nextInt()
    val c = input.nextInt()

    if (a < b && a < c){
        println(a)
        if (b < c){
            println(b)
            println(c)
        } else {
            println(c)
            println(b)
        }
    } else if (b < a && b < c){
        println(b)
        if (a < c){
            println(a)
            println(c)
        } else {
            println(c)
            println(a)
        }
    } else {
        println(c)
        if (a < b){
            println(a)
            println(b)
        } else {
            println(b)
            println(a)
        }
    }
    println()
    println(a)
    println(b)
    println(c)
}