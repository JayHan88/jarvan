package examples.chapter6

fun main(args: Array<String>) {
    var x = 0
    var sum = 0
    while(true) {
        sum += ++x
        if (x == 3) break
    }
    println(sum)
}