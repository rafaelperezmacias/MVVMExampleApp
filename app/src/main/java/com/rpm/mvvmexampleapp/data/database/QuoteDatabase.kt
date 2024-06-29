package com.rpm.mvvmexampleapp.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.rpm.mvvmexampleapp.data.database.dao.QuoteDao
import com.rpm.mvvmexampleapp.data.database.entities.QuoteEntity

@Database(
    entities = [
        QuoteEntity::class
    ],
    version = 1
)
abstract class QuoteDatabase : RoomDatabase() {

    abstract fun getQuoteDao(): QuoteDao

}