package lista02

import java.util.*

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val x = input.nextFloat()
    val y = input.nextFloat()
    val z = input.nextFloat()

    if(x > 0 && y > 0 && z > 0){
        var a = 0.0F
        var b = 0.0F
        var c = 0.0F

        if (x >= y && x >= z) {
            a = x
            b = y
            c = z
        } else if (y >= x && y >= z) {
            a = y
            b = x
            c = z
        } else if (z >= x && z >= y) {
            a = z
            b = x
            c = y
        }

        if (a >= (b + c)) {
            println("NAO FORMA TRIANGULO")
        } else {
            if ((a*a) == (b*b) + (c*c)) {
                println("TRIANGULO RETANGULO")
            }
            if ((a*a) > (b*b) + (c*c)) {
                println("TRIANGULO OBTUSANGULO")
            }
            if ((a*a) < (b*b) + (c*c)) {
                println("TRIANGULO ACUTANGULO")
            }
            if (a == b && b == c) {
                println("TRIANGULO EQUILATERO")
            } else if (a == b || b == c || c == a) {
                println("TRIANGULO ISOSCELES")
            }
        }
    }
}