package com.ajc.kotlin_revision_demos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        Log.d("SecondActivity", "Second Activity started")


//        lifecycleScope.launch {
//            println("Coroutine started in ${Thread.currentThread().name}")
//            repeat(500) {
//                delay(500)
//                println("The task value is $it")
//            }
//        }

        lifecycleScope.launch {
            withContext(context = Dispatchers.Main) {
                println("Coroutine start in ${Thread.currentThread().name}")
                repeat(100) {
                    delay(500)
                    println("The task value is $it")
                }
            }
        }

        


    }
}