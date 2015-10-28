package com.kamedon.kotlin.android

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.activity_main.btn_send

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_send.setOnClickListener({ view -> Log.d("MainActivity", "click: btn_send") })
    }
}
