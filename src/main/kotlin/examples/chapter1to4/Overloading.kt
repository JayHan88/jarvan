package examples

fun overloading(a:Int) {
    println("overloading(a:Int) cal...")
}

fun overloading(a:String) {
    println("overloading(a:String) cal...")
}

fun overloading(a:Int, b:Int) {
    println("overloading(a:Int, b:Int) cal...")
}

fun overloading(a:Int, b:String) {
    println("overloading(a:Int, b:Stirng) cal...")
}

fun main(args: Array<String>) {
    overloading(10)
    overloading("Hello")
    overloading(10, 20)
    overloading(10, "Hello")
}

