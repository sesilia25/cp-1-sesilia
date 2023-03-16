package terserah.`cp-2`



fun main(){
    val cobanomor = readLine()?.toInt() ?: 0

    for (coba in 1..cobanomor) {
//        println("$coba:")
        val a = readLine()?.toInt() ?: 0

//        println("$coba:")
        val b = readLine()?.toInt() ?: 0

        var sum = 0
        for (i in a..b) {
            if (i % 2 == 1) {
                sum += i
            }
        }
        println("Case $coba : $sum\n")
    }

}

