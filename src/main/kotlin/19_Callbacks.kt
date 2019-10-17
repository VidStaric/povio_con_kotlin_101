fun getToken(callback: (Token) -> Unit) {
    callback(Token(""))
}

fun getUser(token: Token, callback: (User) -> Unit) {
    println(token)
    callback(User())
}

fun createPost(user: User, item: Item, callback: (Post) -> Unit) {
    println("$user $item")
    callback(Post(""))
}

fun postItme(item: Item) {
    getToken { token ->
        getUser(token) { user ->
            createPost(user, item) { post ->
                updateUi(post)
            }
        }
    }
}

private fun updateUi(post: Post) {
    println(post)
}