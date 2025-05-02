package com.example.tiketpertandingan.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "tiket",
    foreignKeys = [
        ForeignKey(
            entity = Pertandingan::class,
            parentColumns = ["id"],
            childColumns = ["idPertandingan"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class Tiket(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val idPertandingan: Int,
    val namaPemesan: String,
    val nomorKursi: String,
    val harga: Double,
    val waktuPemesanan: String
)