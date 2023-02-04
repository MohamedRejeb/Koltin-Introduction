fun main() {
    val userName: String = getUserName()
    greeting(age = 10, userName = userName)

    runLambda {
        println("lambda call")
    }

    stringLambda { string ->
        println(string)
    }

    repeatTimes(times = 10) { index ->
        println(index)
    }
}

// fun + function name
fun getUserName(): String {
    return "User name"
}

fun greeting(age: Int? = null, userName: String) {
    println("Hello $userName")
    println(age)
}

// () -> Unit
fun runLambda(lambda: () -> Unit) {
    lambda()
    lambda()
}

fun stringLambda(lambda: (String) -> Unit) {
    lambda("Hello")
    lambda("Hi")
}

fun repeatTimes(times: Int, lambda: (Int) -> Unit) {
    for (i in 1 .. times) {
        lambda(i)
    }
}