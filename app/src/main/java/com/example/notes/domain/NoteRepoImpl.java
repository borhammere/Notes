package com.example.notes.domain;

import android.graphics.Color;

import java.util.ArrayList;
import java.util.List;

public class NoteRepoImpl implements NoteRepo {
    private List<NoteEntity> data = new ArrayList<>();
    private int counter = 0;

    public NoteRepoImpl() {
        // добавим фейковые данные для разработки
        addNote(new NoteEntity(
                createRandomId(),
                "Заголовок",
                "Привет, дорогой дневник",
                Color.RED
        ));
        addNote(new NoteEntity(
                createRandomId(),
                "Название",
                "Здравствуй, дорогой дневник",
                Color.GREEN
        ));
        addNote(new NoteEntity(
                createRandomId(),
                "Title",
                "Hello, my dear diary",
                Color.YELLOW
        ));
        addNote(new NoteEntity(
                createRandomId(),
                "kljxbkljn sdlknv",
                "adflkbnvaldkfnblakdnf",
                Color.BLUE
        ));
    }

    @Override
    public void addNote(NoteEntity noteEntity) {
        data.add(noteEntity);
    }

    @Override
    public List<NoteEntity> getNotes() {
        return new ArrayList<>(data); // отдаём не саму оригинальную коллекцию, а её копию
    }

    @Override
    public void deleteNoteById(int id) {
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getId() == id) {
                data.remove(i);
                break;
            }
        }
    }

    @Override
    public void deleteAll() {
        data.clear();
    }

    @Override
    public int createRandomId() {
        return counter++;
    }
}
