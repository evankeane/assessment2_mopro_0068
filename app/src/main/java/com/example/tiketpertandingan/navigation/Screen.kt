package com.example.tiketpertandingan.navigation


sealed class Screen(val route: String) {
    data object  Home: Screen("mainScreen")
    data object Pertandingan: Screen("pertandingan")
}