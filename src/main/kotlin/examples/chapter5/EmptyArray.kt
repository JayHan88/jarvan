package examples.chapter5

fun main(args: Array<String>) {
    var array22= arrayOfNulls<Any>(3)
    array22[0]=10
    array22[1]="hello"
    array22[2]=true
    println("${array22[0]} .. ${array22[1]} .. ${array22[2]}")

    var emptyArray=Array<String>(3,{""})
    emptyArray[0]="hello"
    emptyArray[1]="world"
    emptyArray[2]="kkang"
    println("${emptyArray[0]} .. ${emptyArray[1]} .. ${emptyArray[2]}")
}
