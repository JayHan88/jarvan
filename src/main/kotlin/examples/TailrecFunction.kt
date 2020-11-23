package examples

fun loopPrint(no: Int = 1) {
    var count = 1
    while(true) {
        println("loopPrint...")
        if (count == no)
            return
        else
            count++
    }
}

fun recPrint(no:Int = 1, count:Int = 1) {
    println("recPrint...")
    return if (count == no)
    return else recPrint(no-1, count)
}

tailrec fun tailRecPrint(no:Int = 1, count: Int = 1) {
    println("tailRecPrint...")
    return if (count == no)
    return else tailRecPrint(no-1, count)
}

fun main(args: Array<String>) {
    loopPrint(3)
    recPrint(3)
    tailRecPrint(3)
}