package examples.chapter5

fun main(args: Array<String>) {

    val immutableMap1 = mapOf<String, String>(Pair("one", "hello"), Pair("two", "world"))
    println("${immutableMap1.get("one")} .. ${immutableMap1.get("two")}")

    val immutableMap2 = mapOf<String, Int>(Pair("one", 1), Pair("two", 2))
    println("${immutableMap2.get("one")} .. ${immutableMap2.get("two")}")

    val immutableMap3 = mapOf<String, Int>()

    val mutableMap = mutableMapOf<String, String>()
    mutableMap.put("one", "hello")
    mutableMap.put("two", "map")
    println("${mutableMap.get("one")} .. ${mutableMap.get("two")}")


}