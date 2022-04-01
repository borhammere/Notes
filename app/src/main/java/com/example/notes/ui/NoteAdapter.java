package com.example.notes.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.notes.R;
import com.example.notes.domain.NoteEntity;

import java.util.List;

public class NoteAdapter extends RecyclerView.Adapter<NoteViewHolder> {
    private List<NoteEntity> data;

    @NonNull
    @Override
    public NoteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.item_note, parent, false);
        NoteViewHolder viewHolder = new NoteViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull NoteViewHolder holder, int position) {
        final NoteEntity noteEntity = data.get(position);
        holder.titleTextView.setText(noteEntity.getTitle());
        holder.contentTextView.setText(noteEntity.getContent());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public void setData(List<NoteEntity> notes) {
        data = notes;
        notifyDataSetChanged();
    }

}
