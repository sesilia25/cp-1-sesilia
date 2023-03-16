package terserah.`cp-2`

fun main() {
    val sentenceWithDoubleQuotes = "Ini adalah \"kalimat\" dengan tanda kutip ganda."
    val sentenceWithSingleQuotes = sentenceWithDoubleQuotes.replace("\"", "' ")
    println(sentenceWithSingleQuotes)
}