package examples.chapter6

fun main(args: Array<String>) {
    for (i in 1..3) {
        for (j in 1..3) {
            if (j > 1) break
            println("i : $i, j : $j")
        }
    }

    at@ for (i in 1..3) {
        for (j in 1..3) {
            if (j > 1) break@at
            println("i : $i, j : $j")
        }
    }
}