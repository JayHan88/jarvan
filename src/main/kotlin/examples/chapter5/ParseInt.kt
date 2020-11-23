package examples.chapter5

fun parseInt(str: String): Int? {
    return str.toIntOrNull()
}

fun main(args: Array<String>){
    println(parseInt("3"))
    println(parseInt("hello"))
}