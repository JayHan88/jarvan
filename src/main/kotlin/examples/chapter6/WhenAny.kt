package examples.chapter6

fun whenAny(data: Any) {
    when(data) {
        1 -> println("data is 1")
        "hello" -> println("data is hello")
        is Boolean -> println("data is boolean")
        else -> println("data is $data")
    }
}

fun main(args: Array<String>) {
    println(whenAny(1))
    println(whenAny("hello"))
    println(whenAny(true))
    println(whenAny(44))

    val data = 15
    when {
        data < 20 -> println("data is smaller than 20")
        data == 0 -> println("data is zero")
        else -> println("data >= 20")
    }

    val data2 = 3
    val result =
            when(data2) {
                1 -> "one"
                2 -> "two"
                3 -> "three"
                else -> "4 and more"
            }
    println(result)
}