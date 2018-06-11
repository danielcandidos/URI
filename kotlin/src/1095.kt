package lista03

fun main(args: Array<String>) {

    for (k in 0..12) {
        val i = 1 + (k*3)
        val j = 60 - (k*5)
        println("I=$i J=$j")
    }
    for (a in 1..9 step 2) {
        for (b in 1..3) {
            val j = 7 - (b - 1)
            println("I=$a J=$j")
        }
    }
}