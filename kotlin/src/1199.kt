package lista07

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    var line = ""

    while (line != "-1") {
        line = input.next()

        if (line != "-1") {
            if (line.matches("0x.*".toRegex())) {
                line = line.substring(2)
                println(Integer.parseInt(line, 16))
            } else {
                val num = Integer.parseInt(line)
                println("0x" + Integer.toString(num, 16).toUpperCase())
            }
        }
    }
}