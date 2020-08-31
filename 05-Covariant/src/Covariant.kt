class Covariant<out T>(val data: T) {
    fun data(): T {
        return data
    }

    // tidak boleh membuat function dengan input generic covariant
//    fun setData(param: T){
//        data = param
//    }
}