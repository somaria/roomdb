package com.example.composeroomdb.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.composeroomdb.roomDB.Note
import kotlinx.coroutines.launch
import androidx.lifecycle.asLiveData

class NoteViewModel(private val repository: Repository): ViewModel() {

    fun upsertNote(note: Note) = viewModelScope.launch {
        repository.upsertNote(note)
    }

    fun deleteNote(note: Note) = viewModelScope.launch {
        repository.deleteNote(note)
    }

    fun getNotes() = repository.getAllNotes().asLiveData(viewModelScope.coroutineContext)

}