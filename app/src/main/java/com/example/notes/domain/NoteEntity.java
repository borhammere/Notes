package com.example.notes.domain;

public class NoteEntity {
    private final int id;
    private String title;
    private String content;
    private int color;

    public NoteEntity(int id) {
        this.id = id;
    }

    public NoteEntity(int id, String title, String content, int color) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    // setId(int id) мы не делаем

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}