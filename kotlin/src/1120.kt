package lista08

import java.util.Scanner


fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    while (true) {
        val line = input.nextLine().split(" ")

        val numA = line[0]
        val numB = line[1]

        if (numA == "0" && numB == "0") {
            break
        }

        var r = numB.replace(numA, "")
        r = r.replaceFirst("0*".toRegex(), "")

        println(if (r.isNotEmpty()) r else 0)
    }
}