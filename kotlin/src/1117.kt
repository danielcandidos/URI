package lista03

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    var gradeRead = 0
    var total = 0.0

    while (gradeRead < 2) {
        val grade = input.nextFloat()

        if ((grade < 0) or (grade > 10)) {
            println("nota invalida")
            continue
        }
        gradeRead += 1
        total += grade
    }

    System.out.printf("media = %.2f\n", total/2)
}