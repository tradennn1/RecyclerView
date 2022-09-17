package com.tradennn1.recyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CitesViewHolder extends RecyclerView.ViewHolder {
    private TextView cites;

    public CitesViewHolder(@NonNull View itemView) {
        super(itemView);
        cites = itemView.findViewById(R.id.textview);
    }

    public void bind(String textview){
        cites.setText(textview);
    }
}
