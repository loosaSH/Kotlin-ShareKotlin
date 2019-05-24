package net.loosash.sharekotlin.javacoder


val tag = "tag"
fun printTag(){
    println(tag)
}

class KTStaticMethod {

    val test:String = "123"

    companion object{
        @JvmField
        val tag:String = "KTStaticMethod"

        fun printTag(){
            println(tag)
        }
    }

}


fun main() {
    printTag()
}