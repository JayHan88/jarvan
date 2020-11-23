package examples

fun sum3(a:Int, b:Int): Int {
    return a+b
}

fun sum4(a:Int, b:Int): Int = a + b

fun sum5(a:Int, b:Int) = a + b

fun main(args: Array<String>) {
    println(sum3(1,2))
    println(sum4(1,2))
    println(sum5(1,2))
}