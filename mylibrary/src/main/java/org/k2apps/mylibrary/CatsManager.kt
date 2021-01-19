package org.k2apps.mylibrary

import android.content.Context
import android.util.Log
import android.widget.Toast


object CatsManager {
    fun s(c: Context, message: String): String {
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show()
        Log.e("TAG", "s: $message")

        return message
    }
}