package examples

var myBool = false
val myVal:String = "hello"
    get() {
        if(myBool)
            return field
        else
            return field.toUpperCase()
    }

fun main(args: Array<String>) {
    println(myVal) // HELLO
    myBool = true
    println(myVal) // hello

}

