package com.example.notes;

import android.app.Application;

import com.example.notes.domain.NoteRepo;
import com.example.notes.domain.NoteRepoImpl;

public class App extends Application {
    private NoteRepo noteRepo = new NoteRepoImpl();

    public NoteRepo getNoteRepo() {
        return noteRepo;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
