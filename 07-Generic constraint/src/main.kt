open class Employee

interface CanSayHello {
    fun sayHello(name: String)
}

class Manager : Employee()

class VicePresident : Employee(), CanSayHello {
    override fun sayHello(name: String) {
        println("Hello $name, vice president")
    }
}

class Company<T>(val employee: T) where T : Employee, T : CanSayHello

fun main() {
//    val data1 = Company(Employee()) // error not CanSayHello
//    val data2 = Company(Manager()) // error not CanSayHello
    val data3 = Company(VicePresident())

    //val data4 = Company(String) // error not Employee

}