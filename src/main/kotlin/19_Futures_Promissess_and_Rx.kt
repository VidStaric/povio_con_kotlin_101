import io.reactivex.rxjava3.core.Single

fun getToken(): Single<Token> = Single.just(Token(""))
fun getUser(token: Token): Single<User> = Single.just(User())
fun createPost(user: User, item: Item): Single<Post> = Single.just(Post(""))

fun postItem2(item: Item) {
    getToken()
            .flatMap { getUser(it) }
            .flatMap { createPost(it, item) }
            .subscribe({ updateUi(it) }, { it.printStackTrace() })
}

private fun updateUi(post: Post) {}