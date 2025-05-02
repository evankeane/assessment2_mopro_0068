package com.example.tiketpertandingan.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "pertandingan")
data class Pertandingan(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val namaTimHome: String,
    val namaTimAway: String,
    val tanggal: String,
    val lokasiStadion: String
)
