package lista03

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    while (true){
        val x = input.nextInt()

        if (x == 2002){ println("Acesso Permitido"); break }
        else{ println("Senha Invalida") }
    }
}