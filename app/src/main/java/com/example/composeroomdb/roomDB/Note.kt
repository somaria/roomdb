package com.example.composeroomdb.roomDB

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class Note(
    val noteName: String,
    val noteBody: String,
    @PrimaryKey(autoGenerate = true)
    val noteId : Int = 0
)
