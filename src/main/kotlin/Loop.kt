fun main() {
    // For loop
    val letters = listOf("a", "b", "c", "d")

    for (letter in letters) {
        println(letter)
    }

    for ((index, letter) in letters.withIndex()) {
        println("$index + $letter")
    }

    letters.forEach { letter ->
        println(letter)
    }

    letters.forEachIndexed { index, letter ->
        println("$index + $letter")
    }

    for (i in 1..10) {
        print(i)
    }

    println()

    for (i in 10 downTo 1) {
        print(i)
    }

    println()

    for (i in 2..6 step 2) {
        print(i)
    }

    println()

    for (i in 'a'..'z') {
        print(i)
    }

    // While loop
    var counter = 0
    while (counter < 5) {
        println(counter)
        counter++
    }

    while (false) {
        println("Enter while")
    }

    do {
        println("Enter do while")
    } while (false)

    // repeat
    repeat(10) { i ->
        print(i)
    }
}