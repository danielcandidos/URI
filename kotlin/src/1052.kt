package lista02

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val mesNum = input.nextInt()
    var mesNome = ""

    when (mesNum) {
        1 -> mesNome = "January"
        2 -> mesNome = "February"
        3 -> mesNome = "March"
        4 -> mesNome = "April"
        5 -> mesNome = "May"
        6 -> mesNome = "June"
        7 -> mesNome = "July"
        8 -> mesNome = "August"
        9 -> mesNome = "September"
        10 -> mesNome = "October"
        11 -> mesNome = "November"
        12 -> mesNome = "December"
    }

    if (mesNome != ""){
        println(mesNome)
    }
}