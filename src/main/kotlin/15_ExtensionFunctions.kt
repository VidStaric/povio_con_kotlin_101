fun String.capitalizeWords(): String =
        split(" ").map { it.capitalize() }.joinToString(" ")

fun main() {
    val textVariable = "some more text to capitalise"

    "text to capitalise".capitalizeWords()
    textVariable.capitalizeWords()
}
