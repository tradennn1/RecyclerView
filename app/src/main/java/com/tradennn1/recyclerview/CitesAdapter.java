package com.tradennn1.recyclerview;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CitesAdapter extends RecyclerView.Adapter<CitesViewHolder> {

    private ArrayList<String> citesList;

    public CitesAdapter(ArrayList<String> citesList) {
        this.citesList = citesList;
    }

    @NonNull
    @Override
    public CitesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CitesViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cites, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CitesViewHolder holder, int position) {
        holder.bind(citesList.get(position));
    }

    @Override
    public int getItemCount() {
        return citesList.size();
    }
}
