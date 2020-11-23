package examples

tailrec fun sum11(n: Int): Int {
    if (n <= 0)
        return n
    else
        return n + sum11(n-1)
}

tailrec fun sum44(n: Int, result: Int = 0): Int {
    if (n <= 0)
        return result
    else
        return sum44(n-1, result + n)
}

fun main(args: Array<String>) {
    println(sum11(4))
    println(sum44(4))
}