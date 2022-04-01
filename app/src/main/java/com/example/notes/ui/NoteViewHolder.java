package com.example.notes.ui;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.notes.R;

public class NoteViewHolder extends RecyclerView.ViewHolder {
    TextView titleTextView = itemView.findViewById(R.id.title_text_view);
    TextView contentTextView = itemView.findViewById(R.id.content_text_view);

    public NoteViewHolder(@NonNull View itemView) {
        super(itemView);
        itemView.setOnClickListener(v -> {
            // todo обработать нажатия
        });
    }
}
