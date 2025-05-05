package com.example.tiketpertandingan.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.tiketpertandingan.entity.Tiket

@Dao
interface TiketDao {
    @Query("SELECT * FROM tiket")
    suspend fun getAll(): List<Tiket>

    @Insert
    suspend fun insert(tiket: Tiket)

    @Update
    suspend fun update(tiket: Tiket)

    @Delete
    suspend fun delete(tiket: Tiket)
}