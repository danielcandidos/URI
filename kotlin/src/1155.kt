package lista04

fun main(args: Array<String>) {
    var s: Float = 0.0F

    for (i in 1..100) {
        s += 1/i.toFloat()
    }

    System.out.printf("%.2f\n", s)
}