package com.example.notes.domain;

import com.example.notes.domain.NoteEntity;

import java.util.List;

public interface NoteRepo {
    // CRUD
    // Create
    // Read
    // Update (-)
    // Delete

    // Create
    // сохранение новой заметки
    void addNote(NoteEntity noteEntity);

    // Read
    // получение всех заметок из репозитория
    List<NoteEntity> getNotes();

    // Delete
    // удаление заметки с указанным id
    void deleteNoteById(int id);

    // не ограничены добавить что угодно
    void deleteAll();

    int createRandomId();
}
