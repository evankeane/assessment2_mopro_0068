package com.example.tiketpertandingan.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.tiketpertandingan.entity.Pertandingan

@Dao
interface PertandinganDao {
    @Query("SELECT * FROM pertandingan")
    suspend fun getAll(): List<Pertandingan>

    @Insert
    suspend fun insert(pertandingan: Pertandingan)

    @Update
    suspend fun update(pertandingan: Pertandingan)

    @Delete
    suspend fun delete(pertandingan: Pertandingan)
}