package lista07

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    while (input.hasNext()) {
        val n = input.nextInt()
        val m = input.nextInt()
        var s = 0
        for (i in n..m) {
            if (!(i.toString().matches(".*(.).*\\1.*".toRegex()))) {
                s++
            }
        }
        println(s)
    }
}