package com.example.georecycleview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class GeoViewHolder extends RecyclerView.ViewHolder {
    private TextView tvGeo;
    public GeoViewHolder(@NonNull View itemView) {
        super(itemView);
        tvGeo = itemView.findViewById(R.id.Geo);
    }

    public void bind(String Number) {
        tvGeo.setText(Number);}
}