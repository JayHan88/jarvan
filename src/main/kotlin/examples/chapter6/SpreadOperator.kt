package examples.chapter6

import java.util.Arrays.asList

fun main(args: Array<String>) {

    val array = arrayOf(10, 20, 30)
    // val list = listOf<Int>(100, array[0], array[1], array[2], 200, 300)
    val list = asList(100, *array, 200, 300)
    list.forEach({println(it)})

}