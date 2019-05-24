package net.loosash.sharekotlin.demo

import android.content.Context
import android.util.AttributeSet
import android.view.View

class KTConstructor1 (){

    var age:Int = 0
    var name:String? = null

    constructor(age:Int,name:String) : this() {
        this.age = age
        this.name = name
    }


    fun printParams(){
        println("name:$name age:$age")
    }
}



class CustomView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
    }
}