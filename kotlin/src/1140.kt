package lista07

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    var phrase = ""

    while (phrase != "*") {
        phrase = input.nextLine()

        if (phrase != "*") {

            var isTauto = true
            val phraseSplitted = phrase.splitToSequence(" ")
            val firstLetter = phraseSplitted.first()[0].toUpperCase()

            for (word in phraseSplitted) {
                if (word[0].toUpperCase() != firstLetter) {
                    isTauto = false
                }
            }

            if (isTauto) {
                println("Y")
            } else {
                println("N")
            }
        }
    }
}