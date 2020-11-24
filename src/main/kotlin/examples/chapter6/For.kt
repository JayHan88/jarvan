package examples.chapter6

fun main(args: Array<String>) {
    var sum:Int = 0
    for (i in 1..10) {
        sum += i
    }
    println(sum)

    val list = listOf<String>("Hello", "World", "!")
    val str = StringBuffer()
    for (i in list) {
        str.append(i)
    }
    println(str)

    val list2 = listOf("Hello", "World", "!")
    for (i in list.indices) {
        println(list[i])
    }

    val list3 = listOf("Hello", "World", "!")
    for ((index, value) in list3.withIndex()) {
        println("the element at $index is $value")
    }
}