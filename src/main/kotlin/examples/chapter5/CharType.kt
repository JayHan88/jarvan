package examples.chapter5

val charType: Char = '1'
val stringType: String = "11"

var str: String = "Hello"

val str2: String = "Hello\nWorld"
val str3: String = """Hello
World"""

fun main(args: Array<String>) {
    println("str[1] : ${str[1]}")
    println(str2)
    println(str3)

}


