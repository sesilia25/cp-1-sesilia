package terserah.`cp-4`

import java.util.*

fun getNumBits(n: Int): Int {
    var count = 0
    var number = n
    while (number != 0) {
        count += number and 1
        number = number shr 1
    }
    return count
}

fun main() {
    val scanner = Scanner(System.`in`)
    val T = scanner.nextInt()
    repeat(T) {
        val n = scanner.nextInt()
        val x1 = getNumBits(n)
        var x2 = 0
        var number = n
        while (number != 0) {
            x2 += getNumBits(number % 10)
            number /= 10
        }
        println("$x1 $x2")
    }
}


