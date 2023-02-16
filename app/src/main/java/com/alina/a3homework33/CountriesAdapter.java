package com.alina.a3homework33;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CountriesAdapter extends RecyclerView.Adapter<CountriesViewHolder> {
    public CountriesAdapter(ArrayList<String> countries) {
        this.countries = countries;
    }

    private ArrayList<String>countries;
    @NonNull
    @Override
    public CountriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CountriesViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_counties,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull CountriesViewHolder holder, int position) {
        holder.bind(countries.get(position));
    }

    @Override
    public int getItemCount() {
        return countries.size();
    }
}
