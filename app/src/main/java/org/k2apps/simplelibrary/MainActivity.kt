package org.k2apps.simplelibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val a = findViewById<Button>(R.id.button)
        a.setOnClickListener { org.k2apps.mylibrary.CatsManager.s(this,"dddd") }
    }
}