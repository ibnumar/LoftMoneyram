package com.example.loftmoneyram;


import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ItemsActivity extends AppCompatActivity {

    private RecyclerView recycler;
    private ItemsAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items);

        adapter = new ItemsAdapter();

        recycler = findViewById(R.id.recycler);
        recycler.setAdapter(adapter);
        recycler.setLayoutManager(new LinearLayoutManager(this));

        List<Item> items = new ArrayList<>();
        items.add(new Item("Молоко", "70"));
        items.add(new Item("Зубная щетка", "70"));
        items.add(new Item("Сковородка с антипригарным покрытием", "1670"));
        items.add(new Item("Хлеб", "40"));
        items.add(new Item("Кефир", "50"));
        items.add(new Item("Tiguan", "2000000"));


        adapter.setItems(items);
    }
}