package lista01

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val itemId = input.nextInt()
    val itemQtd = input.nextInt()

    if ((itemId >= 1) && (itemId <=5)) {
        var preco = 0.0

        when (itemId) {
            1 -> preco = 4.00
            2 -> preco = 4.50
            3 -> preco = 5.00
            4 -> preco = 2.00
            5 -> preco = 1.50
        }

        val total = itemQtd * preco

        System.out.printf("Total: R$ %.2f\n", total)
    }
}