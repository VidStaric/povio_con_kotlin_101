import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

suspend fun getImage(name: String): Image {
    delay(2000)
    return Image(name)
}

fun loadImages(name1: String, name2: String) {
    runBlocking {
        val deferred1 = async { getImage(name1) }
        val deferred2 = async { getImage(name2) }
        udpateUi(deferred1.await(), deferred2.await())
    }
}

fun main() {
    loadImages("image1", "image2")
}

private fun udpateUi(image1: Image, image2: Image) {
    println("$image1\n$image2")
}



