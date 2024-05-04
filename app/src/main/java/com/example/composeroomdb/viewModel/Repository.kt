package com.example.composeroomdb.viewModel

import androidx.room.Delete
import androidx.room.RoomDatabase
import androidx.room.Upsert
import com.example.composeroomdb.roomDB.Note
import com.example.composeroomdb.roomDB.NoteDatabase
import com.example.composeroomdb.roomDB.RoomDao

class Repository(private val db: NoteDatabase) {

    suspend fun upsertNote(note: Note) {
        db.dao.upsertNote(note)
    }

    suspend fun deleteNote(note: Note) {
        db.dao.deleteNote(note)
    }


    fun getAllNotes() =
        db.dao.getAllNotes()


}