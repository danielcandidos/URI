package lista07

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    while (true) {
       val num = input.nextInt()
       if (num == 0) {
           break
       }
       println(num * (num + 1) * (3 * num - num + 1) / 6)
    }
}