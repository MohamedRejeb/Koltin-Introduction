fun main() {
    // Immutable
    val colors: List<String> = listOf("red", "blue", "green")

    // Mutable
    val mutableColors: MutableList<String> = mutableListOf("red", "blue", "green")
    println(mutableColors)
    mutableColors.add("yellow")
    mutableColors.add(0, "black")
    println(mutableColors)
    val isRemoved = mutableColors.remove("red")
    println(isRemoved)
    println(mutableColors)

    val strings: List<String> = listOf("red", "dasdsdasd", "sdfdsfdsfdsf")

    val filteredString = strings.filter { string ->
        string.length > 4
    }

    println(filteredString)

    val stringNumbers: List<String> = listOf("1", "2", "3")

    println(stringNumbers)

    val numbers: List<Int> = stringNumbers.map { string ->
        string.toInt()
    }

    val customNumber = stringNumbers.map { string ->
        string + "0"
    }

    println(customNumber)
}