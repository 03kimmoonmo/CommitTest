package com.example.makeprj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        doTest(FirstTest(::WriteLn))
    }
    private fun dotest(o:TestClass){
        o.dotest()
    }
    fun WriteLn(any:Any){
        txtMessage.text = "${txtMessage.text}${any.toString()}\n"
    }
}//testtesttesttesttestteststesttesttesttest