lateinit var onClick: (String) -> Unit

fun main() {
    setListener { println(it) }
}

fun setListener(listener: (String) -> Unit) = listener("clicked")

//extra example

fun <T, R> Collection<T>.fold(
        initial: R,
        combine: (acc: R, nextElement: T) -> R
): R {
    var accumulator: R = initial
    for (element: T in this) {
        accumulator = combine(accumulator, element)
    }
    return accumulator
}