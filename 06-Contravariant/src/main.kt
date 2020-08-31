fun main() {
    val contravariantAny = Contravariant<Any>()
    var contravariantString: Contravariant<String> = contravariantAny

    contravariantString.sayHello("Alvin")
}