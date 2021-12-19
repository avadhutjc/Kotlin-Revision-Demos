package com.ajc.kotlin_revision_demos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.delay


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLaunch.setOnClickListener {
            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            startActivity(intent)
        }
    }

    suspend fun doSomethingUsefulOne() : Int {
        delay(1000L)
        return 13
    }

    suspend fun doSomethingUsefulTwo() : Int {
        delay(1000L)
        return 29
    }


}