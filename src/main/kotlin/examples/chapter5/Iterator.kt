package examples.chapter5

fun main(args: Array<String>) {

    val list: List<String> = listOf("hello", "list")
    val iterator1 = list.iterator()
    while (iterator1.hasNext()) {
        println(iterator1.next())
    }

    val map: Map<String, String> = mapOf("one" to "hello", "two" to "map")
    val iterator2: Iterator<Map.Entry<String, String>> = map.iterator()
    while (iterator2.hasNext()) {
        val entry = iterator2.next()
        println("${entry.key} - ${entry.value}")
    }

    val set:Set<String> = setOf("hello", "set")
    val iterator3 = set.iterator()
    while (iterator3.hasNext()) {
        println(iterator3.next())
    }

    val array:Array<String> = arrayOf("hello", "world")
    val iterator4 = array.iterator()
    while (iterator4.hasNext()) {
        println(iterator4.next())
    }
}