package com.example.applicationserie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class AjoutSerie extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajout_serie);
    }

    public void bt1Clic(View view){
        EditText titre = findViewById(R.id.txtTitre);
        EditText premiereDiffusion = findViewById(R.id.txtPremDiff);
        EditText duree = findViewById(R.id.txtDuree);
        EditText image = findViewById(R.id.txtImage);
        EditText resume = findViewById(R.id.txtResume);

        Serie serie = new Serie(0, titre.getText().toString(), resume.getText().toString(), duree.getText().toString(), premiereDiffusion.getText().toString(), image.getText().toString());
        SerieSqlHelper listeSerieSql = new SerieSqlHelper(AjoutSerie.this);
        listeSerieSql.addSerie((serie));
        startActivity(new Intent(AjoutSerie.this, MainActivity.class));

    }
}