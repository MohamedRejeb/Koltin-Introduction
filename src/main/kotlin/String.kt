fun main() {
    val firstName = "First name"
    val lastName = "Last name"

    val fullName = "Hello: $firstName ${lastName.length}"

    val language = "kotlin"
    val string = "Hello $language \n"

    val s = """
        Heelo
        Kotlin
        test 
    """.trimIndent()

    println(string)
    println(s)
    println(fullName)

    val x = 10
    val y = 20

    println("x + y = ${x + y}")

    val str: String = "string"
    val char: Char = 'R'
}