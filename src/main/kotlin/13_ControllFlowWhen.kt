fun saySomething(x: Any?) {
    when(x){
        1 -> print("x == 1")
        2,3,4 -> print("2, 3, 4")
        in 5..10 -> print("5 to 10")
        is UserData -> print(x.firstName)
        else -> throw IllegalArgumentException("Can't handle that")
    }
}