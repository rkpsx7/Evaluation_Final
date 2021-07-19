package com.example.evaluation_final;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<Model> dataList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initViews();
        buildData();

    }

    private void buildData() {

    }

    private void initViews() {
        recyclerView = findViewById(R.id.recyclerView);
    }
}