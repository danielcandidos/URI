package lista06

import java.util.Scanner
import java.util.TreeMap

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val num = input.nextInt()

    println(toRoman(num))
}

private fun toRoman(number: Int): String? {
    val map = TreeMap<Int, String>()

    map.put(1000, "M")
    map.put(900, "CM")
    map.put(500, "D")
    map.put(400, "CD")
    map.put(100, "C")
    map.put(90, "XC")
    map.put(50, "L")
    map.put(40, "XL")
    map.put(10, "X")
    map.put(9, "IX")
    map.put(5, "V")
    map.put(4, "IV")
    map.put(1, "I")

    val l = map.floorKey(number)

    return if (number == l) {
        map.get(number)
    } else map.get(l) + toRoman(number - l)
}