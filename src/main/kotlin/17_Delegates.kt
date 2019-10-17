val lazyValue: String by lazy {
    println("setup done!")
    "Hello"
}

fun main() {
    println(lazyValue)
    println(lazyValue)
}