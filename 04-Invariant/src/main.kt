class Invariant<T> (val data: T)

fun main() {
    val invariantString = Invariant("Alvin")
    val invariantAny: Invariant<Any> = invariantString // tidak bisa

    // kalau pun bisa nanti error
    invariantAny.data = 1000
}