class Fruit(val name: String, val quantity: Int) : Comparable<Fruit> {
    override operator fun compareTo(other: Fruit): Int {
        return quantity.compareTo(other.quantity)
    }
}