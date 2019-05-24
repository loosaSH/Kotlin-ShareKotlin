package net.loosash.sharekotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import net.loosash.sharekotlin.demo.times
import net.loosash.sharekotlin.javacoder.KTStaticMethod
import net.loosash.sharekotlin.javacoder.Preference

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvMain.text = "123"

        "abc".times(3)

        var a by Preference(this,"a",0)
        Log.e("xx","a:$a")
        a = 10




        val intent = Intent().apply {
            action = "asf"
            setClass(this@MainActivity,Main2Activity::class.java)
            startActivity(this)
        }


    }


}
