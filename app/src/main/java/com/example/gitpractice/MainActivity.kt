package com.example.gitpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("This is second commit")


        println("Experimental branch")
        println("change3")


        println("Experimental3")
        println("change2")
        println("Hello")
    }
}