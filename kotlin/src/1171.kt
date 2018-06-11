package lista07

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val qtd = input.nextInt()

    val arrayNum = IntArray(2001)

    for (i in 0 until qtd) {
        val num = input.nextInt()
        arrayNum[num]++
    }

    for (j in 0..2000) {
        if (arrayNum[j] > 0) {
            println(j.toString() + " aparece " + arrayNum[j] + " vez(es)")
        }
    }
}