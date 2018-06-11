package lista03

fun main(args: Array<String>) {
    var step = 0
    for (a in 1..9 step 2) {
        step += 1
        for (b in 7 downTo 5) {
            val j = b + (2*(step-1))
            println("I=$a J=$j")
        }
    }
}