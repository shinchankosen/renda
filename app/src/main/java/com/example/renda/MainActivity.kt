package com.example.renda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var cnt = 0;
        but.textSize = 100.0F
        but.setOnClickListener{
            cnt++;
            but.text = cnt.toString()
        }
    }
}