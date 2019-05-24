package net.loosash.sharekotlin.javacoder

fun main() {
    for(i in 0 until 10){
        print("$i ") // 0 1 2 3 4 5 6 7 8 9
    }
    println()

    for (i in 0 .. 10){
        print("$i ") // 0 1 2 3 4 5 6 7 8 9 10
    }
    println()

    val list:ArrayList<Int> = arrayListOf(1,2,3,4,5,6)
    for (i in list){
        print("$i ") // 1 2 3 4 5 6
    }
    println()



    abc@for(i in 0..10){
        for (x in 1..5){
            if (x==2){
                break@abc
            }
            print("i:$i x:$x  ")
        }
    }
    println()



    run {
        listOf(1, 2, 3, 4, 5).forEach {
            if (it == 3) return // 从传入 run 的 lambda 表达式非局部返回
            print(it)
        }
    }
    print(" done with nested loop")
    println()

    foo()

}


fun foo() {
    run loop@{
        listOf(1, 2, 3, 4, 5).forEach {
            if (it == 3) return@loop // 从传入 run 的 lambda 表达式非局部返回
            print(it)
        }
    }
    print(" done with nested loop")
}