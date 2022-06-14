package com.example.georecycleview;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class GeoAdapter extends RecyclerView.Adapter<GeoViewHolder> {
    private ArrayList<String> geo;

    public GeoAdapter(ArrayList<String> geo) {
        this.geo = geo;
    }

    @NonNull
    @Override
    public GeoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new GeoViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_geo,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull GeoViewHolder holder, int position) {
        holder.bind(geo.get(position));

    }

    @Override
    public int getItemCount() {
        return geo.size();
    }
}