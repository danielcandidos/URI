package lista07

import java.util.Scanner

fun main(args: Array<String>) {
    val ALPHABETH = "`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./"
    val KEYBOARD = ALPHABETH.toCharArray()

    val input = Scanner(System.`in`)

    while (input.hasNext()) {
        val line = input.nextLine()

        for (letter in line) {
            val index = ALPHABETH.indexOf(letter)
            if (index != -1) {
                print(KEYBOARD[index - 1])
            } else {
                print(letter)
            }
        }
        println()
    }
}