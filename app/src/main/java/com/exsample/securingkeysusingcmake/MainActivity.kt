package com.exsample.securingkeysusingcmake

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    init {
        System.loadLibrary("native-lib")
    }

    external fun stringFromJNI(): String?

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


            Log.d("MainActivity", stringFromJNI().toString())
    }
}