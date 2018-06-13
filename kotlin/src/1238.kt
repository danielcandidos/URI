package lista08

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val qtd = input.nextInt()

    for (i in 1..qtd) {
        val word1 = input.next()
        val word2 = input.next()

        val maxWord: String
        val minLength: Int

        if (word1.length > word2.length) {
            maxWord = word1
            minLength = word2.length
        } else {
            maxWord = word2
            minLength = word1.length
        }

        var wordFinal = ""

        for (i in 0 until minLength) {
            wordFinal += word1[i]
            wordFinal += word2[i]
        }

        wordFinal += maxWord.substring(minLength, maxWord.length)

        println(wordFinal)
    }
}