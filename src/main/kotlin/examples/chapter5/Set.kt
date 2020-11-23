package examples.chapter5

fun main(args: Array<String>) {
    val immutableSet = setOf<String>("hello", "hi", "world")
    println("${immutableSet.elementAt(0)} .. ${immutableSet.elementAt(1)} .. ${immutableSet.elementAt(2)}")

    val mutableSet = mutableSetOf<String>()
    mutableSet.add("hello")
    mutableSet.add("hi")
    mutableSet.add("world")
    println("${mutableSet.elementAt(0)} .. ${mutableSet.elementAt(1)} .. ${mutableSet.elementAt(2)}")

}