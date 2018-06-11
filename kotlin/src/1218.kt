package lista07

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    var cases = 1

    while (input.hasNext()) {
        val num = input.nextLine()
        if (num.isNotBlank()) {
            val target = num.toInt()
            val shoes = input.nextLine()

            val shoesSplitted = shoes.splitToSequence(" ")

            var equalsF = 0
            var equalsM = 0

            for (i in 0 until shoesSplitted.count()) {
                if (i % 2 == 0) {
                    if (shoesSplitted.elementAt(i).toString() == target.toString()) {
                        val next = shoesSplitted.elementAt(i + 1).toString()
                        if (next == "F") {
                            equalsF++
                        } else if (next == "M") {
                            equalsM++
                        }
                    }
                }
            }

            System.out.printf("Caso %d:\n", cases++)
            println("Pares Iguais: " + (equalsF + equalsM))
            println("F: $equalsF")
            println("M: $equalsM")
            println()
        }
    }
}