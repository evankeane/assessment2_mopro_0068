package com.example.tiketpertandingan.ui.theme.screen

import androidx.lifecycle.ViewModel
import com.example.tiketpertandingan.entity.Pertandingan


class PertandinganViewModel : ViewModel() {

    val data = listOf(
        Pertandingan(
            1,
            "Real Madrid",
            "Barcelona",
            "11 Mei 2025, 21:15",
            "Santiago Bernabeu"
        ),
        Pertandingan(
            2,
            "Manchester United",
            "Athletic Club Bilbao",
            "09 Mei 2025, 02:00",
            "Old Trafford"
        ),
        Pertandingan(
            1,
            "PSG",
            "Inter Milan",
            "01 Juni 2025, 02:00",
            "Allianz Arena "
        ),

    )
}