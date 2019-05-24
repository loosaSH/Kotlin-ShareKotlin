package net.loosash.sharekotlin.javacoder

fun main() {
    var ktLet:String? = "null"
    var newKtLet = ktLet?.let {
        println(it.length)
        it+it.length
    }

    newKtLet?.let {
        println(it)
    }



    var i:String = "5"

    var c = i as? Int

}