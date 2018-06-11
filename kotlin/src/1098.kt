package lista03

fun main(args: Array<String>) {
    for (a in 0..20 step 2) {
        for (b in 1..3) {
            if ((a == 0) or (a == 10) or (a == 20)){
                val i = a/10
                val j = b + i
                println("I=$i J=$j")
            } else {
                val i = a / 10.0
                val j = b + i
                println("I=$i J=$j")
            }
        }
    }
}