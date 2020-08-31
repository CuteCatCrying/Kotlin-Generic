class Data<T>(val data: T)

fun Data<String>.print(){
    val data: String = this.data
    println(data)
}

fun main() {
    val data1: Data<Int> = Data(1)
    val data2: Data<String> = Data("alvin")

//    data1.print()
    data2.print()
}