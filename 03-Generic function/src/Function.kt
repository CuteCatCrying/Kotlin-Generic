class Function(val name: String) {
    fun <T> sayHello(param: T) {
        println("Hello $param, my name is $name")
    }

    fun <T, U> sayHello(param: T, param2: U) {
        println("Hello $param and $param2, my name is $name")
    }
}