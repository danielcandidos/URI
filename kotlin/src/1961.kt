package lista06

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val heightJump = input.nextInt()
    val qtdPipes = input.nextInt()

    val pipes = IntArray(qtdPipes)

    for (i in 0 until qtdPipes) {
        pipes[i] = input.nextInt()
    }

    var win = true

    for (i in 0 until qtdPipes - 1) {
        if (pipes[i + 1] - pipes[i] > heightJump || pipes[i] - pipes[i + 1] > heightJump) {
            win = false
        }
    }

    if (win) {
        println("YOU WIN")
    } else {
        println("GAME OVER")
    }
}