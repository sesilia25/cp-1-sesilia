package terserah.`cp-4`


import java.util.*

fun isPrime(n: Int): Boolean {
    if (n <= 1) {
        return false
    }
    for (i in 2..n / 2) {
        if (n % i == 0) {
            return false
        }
    }
    return true
}

fun isEmirp(n: Int): Boolean {
    if (!isPrime(n)) {
        return false
    }
    val reversed = n.toString().reversed().toInt()
    return n != reversed && isPrime(reversed)
}

fun main() {
    val input = Scanner(System.`in`)
    val numbers = mutableListOf<Int>()
    repeat(5) {
        val n = input.nextInt()
        numbers.add(n)
    }
    for (n in numbers) {
        if (isEmirp(n)) {
            println("$n is emirp")
        } else if (isPrime(n)) {
            println("$n is prime")
        } else {
            println("$n is not prime")
        }
    }
}