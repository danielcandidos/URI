package lista04

import java.util.*
import java.math.BigInteger

fun main(args: Array<String>) {
    val fib = generateSequence(BigInteger.ZERO to BigInteger.ONE) {
        it.second to it.first + it.second
    }.map { it.first }
    val fibo = fib.take(61).toList()

    val input = Scanner(System.`in`)
    val num = input.nextInt()

    for (j in 1..num) {
        val n = input.nextInt()
        val item = fibo[n]
        println("Fib($n) = $item")
    }
}