package lista07

import java.util.*

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    while (input.hasNextLine()) {
        val (x, y, z) = readLine()!!.split(' ')
        val a = x.toInt()
        val b = y.toInt()
        val c = z.toInt()

        val hip = Math.sqrt(a * a + 144.0)
        println(if (hip / c <= 12 / b) "S" else "N")
    }
}