package com.example.georecycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<String> Geo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadData();
        recyclerView = findViewById(R.id.recycler_view);
        GeoAdapter adapter = new GeoAdapter(Geo);
        recyclerView.setAdapter(adapter);
    }

    private void loadData(){
        Geo = new ArrayList<>();
        Geo.add("Dom_1");
        Geo.add("Dom_2");
        Geo.add("Dom_3");
        Geo.add("Dom_4");
        Geo.add("Dom_5");
        Geo.add("Dom_6");
        Geo.add("Dom_7");
        Geo.add("Dom_8");
        Geo.add("Dom_9");
        Geo.add("Dom_10");
    }
}