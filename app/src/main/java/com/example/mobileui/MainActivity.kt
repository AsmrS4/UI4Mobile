package com.example.mobileui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

class MainActivity : ComponentActivity() {

    private val mViewModel = MainViewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mainViewModel = MainViewModel()
        setContent {
//
            DraggableScreen(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Black.copy(0.8f))
            ) {
                MainScreen(mViewModel)
            }
        }
    }
}

