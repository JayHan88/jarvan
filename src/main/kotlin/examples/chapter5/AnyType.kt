package examples.chapter5

fun getLength(obj: Any): Int {
    if (obj is String)
        return obj.length
    return 0
}

fun main(args: Array<String>) {
    println(getLength("Hello"))
    println(getLength("5"))
    println(getLength(5))
}