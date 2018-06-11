package lista02

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val carac1 = input.next()
    val carac2 = input.next()
    val carac3 = input.next()

    if (carac1 == "vertebrado") {
        if (carac2 == "ave") {
            when (carac3) {
                "carnivoro" -> println("aguia")
                "onivoro" -> println("pomba")
            }
        } else if (carac2 == "mamifero") {
            when (carac3) {
                "onivoro" -> println("homem")
                "herbivoro" -> println("vaca")
            }
        }
    } else if (carac1 == "invertebrado") {
        if (carac2 == "inseto") {
            when (carac3) {
                "hematofago" -> println("pulga")
                "herbivoro" -> println("lagarta")
            }
        } else if (carac2 == "anelideo") {
            when (carac3) {
                "hematofago" -> println("sanguessuga")
                "onivoro" -> println("minhoca")
            }
        }
    }
}