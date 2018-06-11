package lista02

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val salario = input.nextDouble()
    var faixa1: Double
    var faixa2: Double
    var faixa3: Double
    val imposto: Double

    if (salario <= 2000) {
        println("Isento")
    } else {
        if (salario > 2000 && salario <= 3000) {
            faixa1 = salario - 2000
            faixa1 = ((faixa1 * 8) / 100)
            imposto = faixa1
        } else if (salario > 3000 && salario <= 4500) {
            faixa1 = salario - 2000
            faixa2 = faixa1 - 1000
            faixa1 -= faixa2
            faixa1 = (faixa1 * 8) / 100
            faixa2 = (faixa2 * 18) / 100
            imposto = faixa1 + faixa2
        } else {
            faixa1 = salario - 2000
            faixa2 = faixa1 - 1000
            faixa3 = faixa2 - 1500
            faixa1 -= faixa2
            faixa2 -= faixa3
            faixa1 = (faixa1 * 8) / 100
            faixa2 = (faixa2 * 18) / 100
            faixa3 = (faixa3 * 28) / 100
            imposto = faixa1 + faixa2 + faixa3
        }
        System.out.printf("R$ %.2f\n", imposto)
    }
}