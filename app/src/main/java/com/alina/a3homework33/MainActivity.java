package com.alina.a3homework33;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> countries;
    private RecyclerView recyclerView;
     private  CountriesAdapter countriesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.rv_countries);
        loadData();
        countriesAdapter=new CountriesAdapter(countries);
        recyclerView.setAdapter(countriesAdapter);
    }

    private void loadData() {
        countries=new ArrayList<>();
        countries.add("Кыргызстан");
        countries.add("Казакстан");
        countries.add("Өзбекстан");
        countries.add("Тажикстан");
        countries.add("Рассия");
        countries.add("Кытай");
        countries.add("Индия");
        countries.add("Монголия");
        countries.add("Америка");
        countries.add("Корея");
        countries.add("Вразилия");
        countries.add("Канада");
        countries.add("Япония");
    }
}