fun main(args: Array<String>) {
    println("Hello World!")

    var name: String = "My name"

    name = "name"

    val list: List<String> = listOf("dfs")

    val mutableList: MutableList<String> = mutableListOf("dfs")

    mutableList.add("New")
    mutableList.remove("New")

    val newList = mutableList.toList()

    var x: String = ""
    x = ""

    val num: Int = 10

    val long: Long = num.toLong()

    val oneMillion = 1_000_000



    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}