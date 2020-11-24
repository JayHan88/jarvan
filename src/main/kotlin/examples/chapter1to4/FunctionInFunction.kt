package examples

fun sum2(a:Int, b:Int): Int {
    var sum:Int = 0

    fun calSum() {
        for(i in a..b)
            sum += i
    }
    calSum()
    return sum
}

fun main(args: Array<String>) {
    println(sum2(1,20))

}