package lista06

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val qtdAllProducts = input.nextInt()
    var price = 0.0

    for (i in 1..qtdAllProducts) {
        val code = input.nextInt()
        val qtdProduct = input.nextInt()

        when (code) {
            1001 -> price += 1.5 * qtdProduct
            1002 -> price += 2.5 * qtdProduct
            1003 -> price += 3.5 * qtdProduct
            1004 -> price += 4.5 * qtdProduct
            1005 -> price += 5.5 * qtdProduct
        }
    }

    System.out.printf("%.2f\n", price)
}