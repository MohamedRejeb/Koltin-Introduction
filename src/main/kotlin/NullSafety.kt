fun main() {
    var string: String? = null


    string = "fsdf"

    if (string == null) {
        println("null")
    } else {
        println(string.length)
    }

    println(string?.length)

    var signedInUser: String? = "User"

    val safeString: String = signedInUser ?: "Log in"
    println(safeString)
}