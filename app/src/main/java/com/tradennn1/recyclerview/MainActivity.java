package com.tradennn1.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> citesList = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);

        citesList.add("New York");
        citesList.add("Washington");
        citesList.add("Texas");
        citesList.add("California");
        citesList.add("Boston");
        citesList.add("Florida");
        citesList.add("Hawaii");
        citesList.add("Alabama");
        citesList.add("North Carolina");
        citesList.add("Michigan");
        citesList.add("Colorado");
        citesList.add("Massachusetts");
        citesList.add("San Francisco");
        citesList.add("Arizona");
        citesList.add("San Diego");
        citesList.add("Virginia");
        citesList.add("Nevada");
        citesList.add("Las Vegas");
        citesList.add("Kentucky");
        citesList.add("Arkansas");
        citesList.add("Missouri");
        citesList.add("Hollywood");
        citesList.add("Oregon");


        CitesAdapter adapter = new CitesAdapter(citesList);
        recyclerView.setAdapter(adapter);

    }
}