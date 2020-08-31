fun displayLength(array: Array<*>) {
    println("Totalnya adalah ${array.size}")
}

fun main() {
    val arrayInt: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    val arrayString: Array<String> = arrayOf("alvin", "ucup", "otong")
    displayLength(arrayInt)
    displayLength(arrayString)
}