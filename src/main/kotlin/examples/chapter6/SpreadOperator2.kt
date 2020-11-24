package examples.chapter6

fun some(vararg a: String) {
    val iterator = a.iterator()
    while(iterator.hasNext()) {
        println(iterator.next())
    }
}

fun main(args: Array<String>) {
    val array = arrayOf("hello", "world", "jay")
    some(*array)

}