package net.loosash.sharekotlin.javacoder


var a = 10
var b = 5

val max = if (a > b) {
    println("Choose a")
    a
} else {
    println("Choose b")
    b
}


fun main() {
    println(max)

    var x = 1
    when (x) {
        1,2 -> println("x==1 or x==2")
        else -> {
            println("x is neither 1 or 2")
        }
    }


    var str = "2"
    when(str){
        x.toString() -> println("x encodes str")
        else ->{
            println("x does not encode str")
        }
    }


}