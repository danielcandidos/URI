package lista08

import java.util.Scanner


fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    while (input.hasNextLine()) {
        val line1 = input.nextLine()
        val line2 = input.nextLine()

        var maxLine: String
        var minLine: String

        if (line1.length >= line2.length) {
            maxLine = line1
            minLine = line2
        } else {
            maxLine = line2
            minLine = line1
        }

        val minLength = minLine.length
        var max = minLength
        var force = true

        while ((max > 0) and (force)) {
            val diff = minLength - max

            for (i in 0..diff) {
                if (maxLine.contains(minLine.substring(i, i + max))) {
                    force = false
                    max++
                    break
                }
            }
            max--
        }

        println(max)
    }
}