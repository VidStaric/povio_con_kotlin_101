import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

suspend fun getToken1(): Token {
    delay(1000)
    println("getToken")
    return Token("")
}

suspend fun getUser1(token: Token): User {
    delay(1000)
    println("getUser")
    return User()
}

suspend fun createPost1(user: User, item: Item): Post {
    delay(1000)
    println("createPost")
    return Post("")
}

fun main() {
    postItem3(Item(""))
}

fun postItem3(item: Item) {
    runBlocking {
        val token = getToken1()
        val user = getUser1(token)
        val post = createPost1(user, item)
        updateUi(post)
    }
}

private fun updateUi(post: Post) {
    println("update Ui")
}