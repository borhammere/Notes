package com.example.notes.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.notes.App;
import com.example.notes.domain.NoteEntity;
import com.example.notes.domain.NoteRepo;
import com.example.notes.R;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private NoteRepo noteRepo;
    private RecyclerView recyclerView;
    private NoteAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();

        noteRepo = getApp().getNoteRepo();
        List<NoteEntity> notes = noteRepo.getNotes();

        adapter.setData(notes);
    }

    private void initViews() {
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new NoteAdapter();
        recyclerView.setAdapter(adapter);
    }

    private App getApp() {
        return (App) getApplication();
    }
}