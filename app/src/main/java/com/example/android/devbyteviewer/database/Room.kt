
package com.example.android.devbyteviewer.database

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Database
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Room
import androidx.room.RoomDatabase

@Dao
interface VideoDao {
    @Query("select * from databasevideo")
    fun getVideos(): LiveData<List<DatabaseVideo>>      // getVideos() to fetch all the videos from the database , via LiveData return type the data displayed in the UI

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(vides: List<DatabaseVideo>)               // insertAll() method to insert a list of videos fetched from the network into the database
}

@Database(entities = [DatabaseVideo::class], version = 1)
abstract class VideosDatabase: RoomDatabase(){
    abstract val videoDao: VideoDao
}

private lateinit var INSTANCE: VideosDatabase       // is singleton Obj,  to prevent having multiple instances of the database opened at the same time.

fun getDatabase(context: Context): VideosDatabase{
    synchronized(VideosDatabase::class.java){
        if (!::INSTANCE.isInitialized){
            INSTANCE = Room.databaseBuilder(context.applicationContext,
            VideosDatabase::class.java,
            "videos"
                ).build()
        }
    }
    return INSTANCE
}
