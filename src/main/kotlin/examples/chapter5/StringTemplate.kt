package examples.chapter5

fun sum(a: Int): Int {
    var sum: Int = 0
    for (i in 1..a) {
        sum += i
    }
    return sum
}

fun main(args: Array<String>) {
    val name: String = "Jay"
    println("Name is $name and the sum is ${sum(10)}")
}