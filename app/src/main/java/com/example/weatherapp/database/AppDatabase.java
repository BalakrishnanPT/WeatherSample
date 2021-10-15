package com.example.weatherapp.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {User.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UserDao userDao();

    public static AppDatabase getDB(Context context) {
        AppDatabase db = Room.databaseBuilder(context, AppDatabase.class, "database-name")
                .allowMainThreadQueries()
                .build();
        return db;
    }
}