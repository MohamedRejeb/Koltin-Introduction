class User(
    val name: String
) {

    fun hello() {
        println("Hello $name")
    }

    companion object {
        fun nameVerification(s: String): Boolean {
            return s.length > 3
        }
    }

}

fun main() {
    val user = User(name = "Name")
    user.hello()
    val name = user.name

    User.nameVerification("test")
}