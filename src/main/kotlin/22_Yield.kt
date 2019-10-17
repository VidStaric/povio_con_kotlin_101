val fibonacci = sequence {
    var cur = 1
    var next = 1
    while (true){
        yield(cur)
        val tmp = cur + next
        cur = next
        next = tmp
    }
}


fun main(){
    val iterator = fibonacci.iterator()

    for (i in 1..10){
        println(iterator.next())
    }
    println("------------------")

    println(iterator.next())
}