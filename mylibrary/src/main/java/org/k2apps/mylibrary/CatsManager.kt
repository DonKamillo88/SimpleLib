package org.k2apps.mylibrary

import android.content.Context
import android.widget.Toast


object CatsManager {
    fun s(c: Context?, message: String?) {
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show()
    }
}