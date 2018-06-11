package lista05

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    var line: String
    var num: Int
    var temp = 0

    while (input.hasNextLine()) {
        line = input.nextLine()

        if (line == "caw caw") {
            println(temp)
            temp = 0
        } else {
            num = when (line) {
                "--*" -> 1
                "-*-" -> 2
                "-**" -> 3
                "*--" -> 4
                "*-*" -> 5
                "**-" -> 6
                "***" -> 7
                else -> 8
            }
            temp += num
        }
    }
}