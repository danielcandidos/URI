package lista02

import java.util.*
import kotlin.math.abs

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val a = input.nextFloat()
    val b = input.nextFloat()
    val c = input.nextFloat()

    var isTriangulo = false

    if ((abs(b - c) < a) && (a < (b + c))){
        if ((abs(a - c) < b) && (b < (a + c))){
            if ((abs(a - b) < c) && (c < (a + b))){
                isTriangulo = true
            }
        }
    }

    if (isTriangulo){
        val perimetro = a + b + c
        System.out.printf("Perimetro = %.1f\n", perimetro)
    } else {
        val area = ((a + b) * c) / 2
        System.out.printf("Area = %.1f\n", area)
    }
}