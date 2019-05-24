package net.loosash.sharekotlin.demo

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch


fun a(): String {
    println("a")
    return "a"
}

fun foo(str:String): String {
    println("foo")
    return "foo$str"
}

fun main() {

    println("hello")

    GlobalScope.launch { // 在后台启动一个新的协程并继续
        val a = async { a() }
        val y = a.await()
    }

    println("world")


}