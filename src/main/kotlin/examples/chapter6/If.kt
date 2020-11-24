package examples.chapter6

fun main(args: Array<String>) {
    val a:Int = 5

    if (a < 10) println("$a < 10 ")
    if (a > 0 && a <= 10) {
        println("0 < $a <= 10")
    } else if (a > 10 && a <= 20) {
        println("10 < $a <= 20")
    } else {
        println("$a > 20")
    }

    val result = if(a > 10) "hello" else "world"
    println(result)

    if(a >10) "hello"

    val result2 =
            if(a<10) {
                print("hello")
                10 + 10
                20 + 20
            } else {
                print("world")
                30
                40
            }
    println(result2)
}