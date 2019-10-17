fun main() {
    val user = UserData("test", "test").apply {
        age = 25
        location = "Slovenia"
    }.also { println(it) }

    val name = user.let { "My name ${it.firstName}" }

}