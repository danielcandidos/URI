package lista02

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val num = input.nextInt()
    var cont = 0

    for (i in num..num+11){
        if ((i % 2 != 0) && (cont < 6)){
            println(i)
            cont++
        }
    }
}