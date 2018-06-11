package lista06

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val numbers = IntArray(5)
    for (i in 0..4) {
        numbers[i] = input.nextInt()
    }

    if (numbers[0] == 1) {
        if ((numbers[1] + numbers[2]) % 2 == 0) {
            if (numbers[3] == 1) {
                if (numbers[4] == 1) {
                    println("Jogador 2 ganha!")
                } else {
                    println("Jogador 1 ganha!")
                }
            } else {
                if (numbers[4] == 1) {
                    println("Jogador 1 ganha!")
                } else {
                    println("Jogador 1 ganha!")
                }
            }
        } else {
            if (numbers[3] == 1) {
                if (numbers[4] == 1) {
                    println("Jogador 2 ganha!")
                } else {
                    println("Jogador 1 ganha!")
                }
            } else {
                if (numbers[4] == 1) {
                    println("Jogador 1 ganha!")
                } else {
                    println("Jogador 2 ganha!")
                }
            }
        }
    } else {
        if ((numbers[1] + numbers[2]) % 2 != 0) {
            if (numbers[3] == 1) {
                if (numbers[4] == 1) {
                    println("Jogador 2 ganha!")
                } else {
                    println("Jogador 1 ganha!")
                }
            } else {
                if (numbers[4] == 1) {
                    println("Jogador 1 ganha!")
                } else {
                    println("Jogador 1 ganha!")
                }
            }
        } else {
            if (numbers[3] == 1) {
                if (numbers[4] == 1) {
                    println("Jogador 2 ganha!")
                } else {
                    println("Jogador 1 ganha!")
                }
            } else {
                if (numbers[4] == 1) {
                    println("Jogador 1 ganha!")
                } else {
                    println("Jogador 2 ganha!")
                }
            }
        }
    }
}