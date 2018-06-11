package lista07

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val qtd = input.nextInt()

    for (i in 1..qtd) {
        val x = input.nextLong()
        println(if (isPrime(x)) "Prime" else "Not Prime")
    }
}

private fun isPrime(n: Long): Boolean {
    if (n > 2 && n % 2 == 0L) {
        return false
    }
    val top = Math.sqrt(n.toDouble()).toInt() + 1
    var i = 3
    while (i < top) {
        if (n % i == 0L) {
            return false
        }
        i += 2
    }
    return true
}