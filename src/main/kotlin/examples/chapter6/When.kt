package examples.chapter6

import examples.chapter1to4.some
import jdk.nashorn.internal.objects.NativeArray.some

fun main(args: Array<String>) {
    val a = 1
    when(a) {
        1 -> println("a == 1")
        2 -> println("a == 2")
        else -> println("a is neither 1 or 2")
    }

    val data1 = "hello"
    when(data1) {
        "hello" -> println("data1 is hello")
        "world" -> println("data1 is world")
        else -> println("data is neither hello or world")
    }

    val data2 = 30
    when(data2) {
        10, 20 -> println("data2 is 10 or 20")
        30, 40 -> println("data2 is 30 or 40")
        10+20 -> println("data2 is 30")
    }

    val data3 = 15
    when(data3) {
        !in 1..100 -> println("invalid data")
        in 0..20 -> println("0 <= data3 <= 20")
        in 21..100 -> println("21 <= data3 <= 100")
    }

    val list:List<String> = listOf("A", "B", "C")
    val array:Array<String> = arrayOf("a", "b", "c")
    val data4 = "C"
    when(data4) {
        in list -> println("data4 is in list")
        in array -> println("data4 is in array")
    }
}