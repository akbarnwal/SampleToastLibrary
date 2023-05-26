package com.example.toastylibrary

import android.content.Context
import android.widget.Toast

fun sampleToast(context: Context, message: String){
    Toast.makeText(context, message, Toast.LENGTH_SHORT).show()

}