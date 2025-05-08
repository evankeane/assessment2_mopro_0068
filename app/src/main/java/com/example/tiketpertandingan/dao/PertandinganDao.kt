package com.example.tiketpertandingan.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.tiketpertandingan.entity.Pertandingan
import kotlinx.coroutines.flow.Flow

@Dao
interface PertandinganDao {
    @Query("SELECT * FROM pertandingan ORDER BY tanggal DESC")
    fun getPertandingan(): Flow<List<Pertandingan>>

    @Insert
    suspend fun insert(pertandingan: Pertandingan)

    @Update
    suspend fun update(pertandingan: Pertandingan)

    @Delete
    suspend fun delete(pertandingan: Pertandingan)
}