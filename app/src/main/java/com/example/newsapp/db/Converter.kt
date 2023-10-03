package com.example.newsapp.db

import androidx.room.TypeConverter
import androidx.room.TypeConverters
import com.example.newsapp.model.Source

class Converters {
    @TypeConverter
    fun toSource(name: String): Source{
        return Source(name, name)
    }

    @TypeConverter
    fun fromSource(source: Source) :String {
        return source.name
    }
}