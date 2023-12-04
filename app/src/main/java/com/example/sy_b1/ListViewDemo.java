package com.example.sy_b1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewDemo extends AppCompatActivity {

    ListView lstCities;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_demo);
        lstCities = findViewById(R.id.lstCities);

        //String cities[] = {"SURAT","BARODA","VAPI","VALSAD","SURAT","BARODA","VAPI","VALSAD"};

        Product prod[] = {

                new Product("iPhone",45000,R.drawable.logo),
                new Product("iPad",65000,R.drawable.logo),
                new Product("iWatch",25000,R.drawable.logo),
                new Product("iMac",95000,R.drawable.logo),
                new Product("AirPod",25000,R.drawable.logo),
        };
        ProductAdapter adapter = new ProductAdapter(ListViewDemo.this,prod);

        lstCities.setAdapter(adapter);

    }
}