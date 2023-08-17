package com.example.thirdmonthsecondproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private CarAdapter carAdapter;
    private ArrayList<String> carList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rv_car);
        loadData();
        carAdapter=new CarAdapter(carList);
        recyclerView.setAdapter(carAdapter);
    }

    private void loadData() {
        carList.add("Lexus");
        carList.add("Toyota");
        carList.add("Mercedes-Benz");
        carList.add("Audi");
        carList.add("Hyundai");
        carList.add("Kia");
        carList.add("Honda");
        carList.add("Tesla");
        carList.add("BMW");
        carList.add("Chevrolet");
        carList.add("Mazda");
        carList.add("Lada");
        carList.add("Volvo");
    }
}