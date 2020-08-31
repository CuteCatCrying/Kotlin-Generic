class MyData<T>(private val firstData: T) {
    fun getData(): T = firstData

    fun printData() {
        println("Data is $firstData")
    }
}