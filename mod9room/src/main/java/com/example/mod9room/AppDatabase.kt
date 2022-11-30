package com.example.mod9room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database (entities = arrayOf(Oiseau::class), version = 1)
abstract class AppDatabase : RoomDatabase(){

    //on liste nos Dao
    abstract fun oiseauDao() : OiseauDao

    companion object{

        private var INSTANCE : AppDatabase? = null

        fun getInstance(context: Context) : AppDatabase{

            var instance = INSTANCE
            //if instance est null, on crée la base de données
            if(instance == null){
                instance = Room.databaseBuilder(
                    context, AppDatabase::class.java, "OiseauDb"
                ).fallbackToDestructiveMigration().build()
            }

            INSTANCE = instance

            return instance
        }

    }
}