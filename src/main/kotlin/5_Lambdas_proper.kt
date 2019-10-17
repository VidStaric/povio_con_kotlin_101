fun main() {
    val array = arrayOf(1, 2, 3, 4)

    array.map { it * 10 }
            .filter { it / 2 == 2 }
            .forEach { print(it) }
}

