package lista05

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val a = input.nextInt()
    val b = input.nextInt()

    var e: Int
    var r: Int
    var f = 0
    val q: Int

    if (a < 0) {
        e = b
        if (b < 0) e = b * -1
        r = 0
        while (r < e) {
            f = a - r
            if (f % b == 0) break
            r++
        }
        q = f / b
    } else {
        q = a / b
        r = a % b
    }

    println("$q $r")
}