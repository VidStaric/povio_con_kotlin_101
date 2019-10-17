fun main() {
    var number: Int? = null
    var otherNumber: Int = 0

    //otherNumber = null //Compiler error
    //number + otherNumber //Compiler error
    var safe = number ?: 0
}