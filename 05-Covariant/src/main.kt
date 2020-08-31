fun main() {
    val covariantString = Covariant<String>("Alvin")
    val covariantAny: Covariant<Any> = covariantString

    println(covariantString.data)
//    covariantAny.setData(100)
}