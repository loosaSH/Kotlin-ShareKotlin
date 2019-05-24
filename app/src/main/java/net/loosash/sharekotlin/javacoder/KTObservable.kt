package net.loosash.sharekotlin.javacoder

import kotlin.properties.Delegates

class KTObservable {
    var name: String by Delegates.observable("") { prop, old, new ->
        println("prop:$prop old:$old new:$new")
    }
}


fun main() {
    val ktObservable = KTObservable()
    ktObservable.name = "123"
    ktObservable.name = "456"
}