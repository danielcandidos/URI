package lista08

import java.util.Scanner


fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    while (input.hasNextLine()) {
        val line = input.nextLine()

        val letters = line.split("".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        var count = 0

        for (letter in letters) {
            var newLetter = letter
            if (letter.matches("\\w".toRegex())) {
                newLetter = if (count++ % 2 == 0) letter.toUpperCase() else letter.toLowerCase()
            }
            print(newLetter)
        }
        println()
    }
}