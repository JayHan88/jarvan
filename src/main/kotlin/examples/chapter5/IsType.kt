package examples.chapter5

fun getStringLength(obj: Any): Int? {
    // val strData: String = obj
    if (obj is String)
        return obj.length
    return null
}

fun getStringLength2(obj: Any): Int? {
    // val strData: String = obj
    if (obj !is String)
        return null
    return obj.length
}

fun main(args: Array<String>) {
    println(getStringLength(3))
    println(getStringLength("hello"))

    println(getStringLength2(3))
    println(getStringLength2("hello"))
}