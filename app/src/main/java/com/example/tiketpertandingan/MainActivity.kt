package com.example.tiketpertandingan

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.tiketpertandingan.navigation.AppNavGraph

import com.example.tiketpertandingan.ui.theme.theme.TiketPertandinganTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TiketPertandinganTheme  {
                AppNavGraph()
            }
        }
    }
}

