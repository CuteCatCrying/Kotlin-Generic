fun main() {
    val myDataString: MyData<String> = MyData<String>("Alvin")
    myDataString.printData()

    val myDataInteger: MyData<Int> = MyData(10)
    myDataInteger.printData()

    val myData: MyData2<String, Int> = MyData2("Alvin", 60)
    myData.printData()

    val myData1 = MyData2(10, "Alvin")
    myData1.printData()
}