package com.example.tiketpertandingan.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.tiketpertandingan.dao.PertandinganDao
import com.example.tiketpertandingan.dao.TiketDao
import com.example.tiketpertandingan.entity.Pertandingan
import com.example.tiketpertandingan.entity.Tiket

@Database(entities = [Pertandingan::class, Tiket::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun pertandinganDao(): PertandinganDao
    abstract fun tiketDao(): TiketDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "tiketbola_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}