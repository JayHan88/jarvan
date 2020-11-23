package examples.chapter5

fun main(args: Array<String>) {
    var array = arrayOf(1, "Jay", true)
    array[0] = 10 as Nothing
    array[2] = "world" as Nothing

    println("${array[0]} ..  ${array[1]} .. ${array[2]}")
    println("size : ${array.size} .. ${array.get(0)} .. ${array.get(1)} .. ${array.get(2)}")

}

