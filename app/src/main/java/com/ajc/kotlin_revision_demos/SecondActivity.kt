package com.ajc.kotlin_revision_demos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        Log.d("SecondActivity", "Second Activity started")

        GlobalScope.launch {
            println("Coroutine started in ${Thread.currentThread().name}")
            repeat(1000) {
                delay(500)
                println("The task value is $it")
            }
        }
    }
}