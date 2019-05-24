package net.loosash.sharekotlin.javacoder

import net.loosash.sharekotlin.Main2Activity

class KTSpecialSymbols

fun main() {
    val ktSpecialSymbols = KTSpecialSymbols()


//    val d = (ktSpecialSymbols::class as Any).javaClass
//    val a = ktSpecialSymbols.javaClass
//    val c = ktSpecialSymbols.javaClass.kotlin
//    val b = ktSpecialSymbols::class.java



    val a = ktSpecialSymbols::class
    val b = ktSpecialSymbols::class.java
    val c = ktSpecialSymbols::javaClass
    val d = ktSpecialSymbols.javaClass

    val e = KTSpecialSymbols::class
    val f = KTSpecialSymbols::class.java
    val g = KTSpecialSymbols::javaClass
}