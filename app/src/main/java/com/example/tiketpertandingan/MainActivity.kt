package com.example.tiketpertandingan

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge

import androidx.compose.runtime.Composable

import androidx.compose.ui.tooling.preview.Preview
import com.example.tiketpertandingan.ui.theme.screen.MainScreen
import com.example.tiketpertandingan.ui.theme.theme.TiketPertandinganTheme
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TiketPertandinganTheme {
                // Panggil MainScreen di sini
                MainScreen(
                    onMenuClick = { menu ->
                        // Tangani aksi klik menu di sini
                        when (menu) {
                            "tambah_tiket" -> {
                                // Navigasi atau logika tambah tiket
                            }
                            "tambah_pertandingan" -> {
                                // Navigasi atau logika tambah pertandingan
                            }
                            "settings" -> {
                                // Navigasi atau logika ke settings
                            }
                        }
                    }
                )
            }
        }
    }
}


