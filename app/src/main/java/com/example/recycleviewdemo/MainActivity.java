package com.example.recycleviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ClipData;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);

        List<itemc> items = new ArrayList<itemc>();
        items.add(new itemc("John","john@rku.ac.in", R.drawable.img));
        items.add(new itemc("John","john@rku.ac.in", R.drawable.img));
        items.add(new itemc("John","john@rku.ac.in", R.drawable.img));
        items.add(new itemc("John","john@rku.ac.in", R.drawable.img));
        items.add(new itemc("John","john@rku.ac.in", R.drawable.img));
        items.add(new itemc("John","john@rku.ac.in", R.drawable.img));
        items.add(new itemc("John","john@rku.ac.in", R.drawable.img));
        items.add(new itemc("John","john@rku.ac.in", R.drawable.img));
        items.add(new itemc("John","john@rku.ac.in", R.drawable.img));
        items.add(new itemc("John","john@rku.ac.in", R.drawable.img));
        items.add(new itemc("John","john@rku.ac.in", R.drawable.img));
        items.add(new itemc("John","john@rku.ac.in", R.drawable.img));
        items.add(new itemc("John","john@rku.ac.in", R.drawable.img));
        items.add(new itemc("John","john@rku.ac.in", R.drawable.img));
        items.add(new itemc("John","john@rku.ac.in", R.drawable.img));
        items.add(new itemc("John","john@rku.ac.in", R.drawable.img));
        items.add(new itemc("John","john@rku.ac.in", R.drawable.img));
        items.add(new itemc("John","john@rku.ac.in", R.drawable.img));
        items.add(new itemc("John","john@rku.ac.in", R.drawable.img));
        items.add(new itemc("John","john@rku.ac.in", R.drawable.img));
        items.add(new itemc("John","john@rku.ac.in", R.drawable.img));
        items.add(new itemc("John","john@rku.ac.in", R.drawable.img));
        items.add(new itemc("John","john@rku.ac.in", R.drawable.img));
        items.add(new itemc("John","john@rku.ac.in", R.drawable.img));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new adapter(getApplicationContext(),items));
    }
}