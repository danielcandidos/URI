package lista07

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    var resp = ""
    var num = -1

    while (num != 0) {
        num = input.nextInt()

        for (i in 0 until num) {
            var total = 0

            val a = input.nextInt()
            val b = input.nextInt()
            val c = input.nextInt()
            val d = input.nextInt()
            val e = input.nextInt()

            if (a <= 127) {
                resp = "A"
                total++
            }
            if (b <= 127) {
                resp = "B"
                total++
            }
            if (c <= 127) {
                resp = "C"
                total++
            }
            if (d <= 127) {
                resp = "D"
                total++
            }
            if (e <= 127) {
                resp = "E"
                total++
            }
            if (total == 1) {
                println(resp)
            } else {
                println("*")
            }
        }
    }
}