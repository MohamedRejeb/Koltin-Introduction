fun main () {
    // if/else statements
    val x = 10
    val y = 20

    if (x > y) {
        println("x is greater than y")
        println("")
    } else {
        println("")
    }

    if (x == y)
        println("x == y")
    else if (x < y)
        println("")
    else
        println("else")

    val range = 100..1000

    if (x in range) {
        println("x in 100..1000")
    } else {
        println("x not in 100..1000")
    }

    var condition = true

    if (!condition) {
        println("!condition")
    }
}