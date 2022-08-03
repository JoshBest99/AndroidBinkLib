package com.bink.binklibrary

import android.content.Context
import android.widget.Toast

class Toaster {

    fun pop(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

}