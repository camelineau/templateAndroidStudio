package com.example.applicationserie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void bt1Clic(View view) {
        startActivity(new Intent(MainActivity.this, AffListeSerie.class));
    }

    public void bt2Clic(View view) {
        startActivity(new Intent(MainActivity.this, AjoutSerie.class));
    }
}