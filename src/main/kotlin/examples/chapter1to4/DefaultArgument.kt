package examples

fun sayHello(name: String?) {
    if (name == null)
        println("Hello, default")
    else
        println("Hello, " + name)
}

fun sayHello2(name: String = "default") {
        println("Hello, " + name)
}

fun sayHello3(name:String = "default", no:Int) {
    println("Hello, " + name)
}


fun main(args: Array<String>) {
    sayHello(null)
    sayHello("Han")

    sayHello2()
    sayHello2("Han")

    // sayHello3(10)
    sayHello3("Han", 10)
    sayHello3(no=10)
    sayHello3(name="Han", no=10)

}