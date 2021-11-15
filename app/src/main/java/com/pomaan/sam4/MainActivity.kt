package com.pomaan.sam4

import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import androidx.appcompat.app.AppCompatActivity
import android.util.Log
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun log(x: List<Char>) {
            TODO("Not yet implemented")
        }

        fun main() {
        val numbers = listOf('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z')
     //   println(numbers.slice(1..13 step 2 ))
    //    println(numbers.slice(13..26 step 2))
        log(numbers.slice(1..13 step 2 ))
        log(numbers.slice(13..26 step 2))
            }
        }
    }
