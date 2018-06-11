package lista03

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    var newCalc = 1

    while(newCalc == 1) {
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

        System.out.printf("media = %.2f\n", total / 2)

        while (true){
            println("novo calculo (1-sim 2-nao)")
            val response = input.nextInt()
            if ((response == 1) or (response == 2)){
                newCalc = response
                break
            }
        }
    }
}