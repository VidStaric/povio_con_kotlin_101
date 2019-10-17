fun main() {
    val array = arrayOf(1, 2, 3, 4)

    array.map { number -> number * 10 }
            .filter { number -> number / 2 == 2 }
            .forEach { number -> print(number) }
}

