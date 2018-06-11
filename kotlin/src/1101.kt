package lista03

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    while (true){
        val x = input.nextInt()
        val y = input.nextInt()

        if ((x <= 0) or (y <= 0)) break

        var a = x; var b = y

        if (x > y){ a = y; b = x}

        var sum = 0
        for (i in a..b){
            sum += i
            print(i); print(" ")
        }
        println("Sum=$sum")
    }
}