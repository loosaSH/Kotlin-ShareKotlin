package net.loosash.sharekotlin.firstmeet

val number: Number = 0
val i: Int = 1
val s: Short = 2
val l: Long = 3
val f: Float = 4f
var d: Double = 5.0
    get() {
        println("获取d的值")
        return 6.0
    }
    set(double) {
//        d = 10.0
        println("设置d的值$double")
        field = double
    }
val str: String
    get() {
        println("获取str值")
        return "123"
    }
const val c: Char = 'a'


fun echo(any: Any): String? {
    println(any)
    return null
}


fun main() {
    println(number)
    println(i)
    println(s)
    println(l)
    println(f)
    println(d)
    d = 6.0
    println(str)
    println(c)

    val s = echo("你好")
}