package lista02

import java.util.*

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val n1 = input.nextFloat()
    val n2 = input.nextFloat()
    val n3 = input.nextFloat()
    val n4 = input.nextFloat()

    val media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10
    System.out.printf("Media: %.1f\n", media)

    if (media >= 7.0){
        println("Aluno aprovado.")

    } else if (media < 5.0){
        println("Aluno reprovado.")

    } else if ((media >= 5.0) && (media < 7.0)){
        println("Aluno em exame.")

        val n5 = input.nextDouble()
        System.out.printf("Nota do exame: %.1f\n", n5)

        val mediaFinal = (media + n5) / 2

        if (mediaFinal >= 5.0){
            println("Aluno aprovado.")

        } else{
            println("Aluno reprovado.")
        }

        System.out.printf("Media final: %.1f\n", mediaFinal)
    }
}