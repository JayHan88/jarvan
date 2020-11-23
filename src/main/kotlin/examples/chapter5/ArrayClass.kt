package examples.chapter5

var array = Array(3, {i -> i*10})
var array2 = intArrayOf(10, 20, 30)

var array3 = IntArray(3, {i -> i*20})
var array4 = Array<Int>(3, {i -> i*20})

fun main(args: Array<String>) {
    println("${array[0]} .. ${array[1]} .. ${array[2]}")
    println("${array2[0]} .. ${array2[1]} .. ${array2[2]}")
    println("${array3[0]} .. ${array3[1]} .. ${array3[2]}")
    println("${array4[0]} .. ${array4[1]} .. ${array4[2]}")
}
