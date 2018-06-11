package lista07

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val qtd = input.nextInt()

    for (caseNumber in 1..qtd) {
        val num = input.next()
        val base = input.next()

        println("Case $caseNumber:")
        when (base) {
            "bin" -> {
                val decimal = Integer.parseInt(num, 2)
                println(decimal.toString() + " dec")
                println(Integer.toString(decimal, 16) + " hex\n")
            }
            "dec" -> {
                val decimal = Integer.parseInt(num)
                println(Integer.toString(decimal, 16) + " hex")
                println(Integer.toString(decimal, 2) + " bin\n")
            }
            "hex" -> {
                val decimal = Integer.parseInt(num, 16)
                println(decimal.toString() + " dec")
                println(Integer.toString(decimal, 2) + " bin\n")
            }
        }
    }
}