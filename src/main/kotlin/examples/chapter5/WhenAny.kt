package examples.chapter5

fun cases(obj: Any): String {
    when(obj) {
        1 -> return "One"
        "Hello" -> return "Greeting"
        is Long -> return "Long"
        !is Long -> return "Not a long"
        else -> return "unknown"
    }
}

fun main(args: Array<String>) {
    println(cases(1))
    println(cases(10L))
    println(cases(2))
    println(cases(10))
}