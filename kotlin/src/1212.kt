package lista07

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    while (true) {
        var a = input.nextInt()
        var b = input.nextInt()

        if ((a == 0) and (b == 0)) {
            break
        }

        var carries = 0
        var r = 0

        while (true) {
            val r1 = a % 10
            val r2 = b % 10
            a /= 10
            b /= 10
            if (r + r1 + r2 > 9) {
                r = 1
                carries++
            } else {
                r = 0
            }
            if (a == 0 && b == 0) {
                break
            }
        }

        if (carries > 0) {
            print(carries.toString() + " carry operation")
            if (carries == 1) {
                println(".")
            } else {
                println("s.")
            }
        } else {
            println("No carry operation.")
        }
    }
}