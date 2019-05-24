package net.loosash.sharekotlin.demo

import java.lang.StringBuilder
import kotlin.reflect.KProperty

class KTExtension {

}

val String.ABC: String
    get() {
        return "abc"
    }

operator fun String.times(times: Int): String {
    val stringBuilder = StringBuilder()
    for (i in 0 until times) {
        stringBuilder.append(this)
    }
    return stringBuilder.toString()
}


fun main() {

    var str = "123"

    println(str.times(3))
    println(str * 3)
}