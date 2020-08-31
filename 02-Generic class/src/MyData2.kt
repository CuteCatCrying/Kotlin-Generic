class MyData2<T, U>(private val firstData: T, private val secondData: U) {
    fun getFirstData(): T = firstData

    fun getSecondData(): U = secondData

    fun printData() {
        println("Data is $firstData $secondData")
    }
}