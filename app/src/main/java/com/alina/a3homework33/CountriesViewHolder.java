package com.alina.a3homework33;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CountriesViewHolder extends RecyclerView.ViewHolder {
    private TextView tvCountries;
    public CountriesViewHolder(@NonNull View itemView) {
        super(itemView);
        tvCountries=itemView.findViewById(R.id.tv_countries);
    }
    void bind(String countries){
        tvCountries.setText(countries);
    }
}
