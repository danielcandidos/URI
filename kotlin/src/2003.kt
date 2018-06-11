package lista06

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    while (input.hasNext()) {
        val time = input.nextLine()

        val timeDiv = time.split(':')
        val hours = timeDiv[0].toInt()
        val minutes = timeDiv[1].toInt()

        val minutesTotal = hours * 60 + minutes
        val possibleDelay = 8 * 60

        if (minutesTotal + 60 > possibleDelay) {
            val maxDelay = minutesTotal + 60 - possibleDelay
            println("Atraso maximo: $maxDelay")
        } else {
            println("Atraso maximo: 0")
        }
    }
}