package com.example.listagemplanetas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent i = getIntent();
        Bundle b = i.getExtras();
        String planet = i.getStringExtra("planet");

        TextView textView = findViewById(R.id.textView);
        textView.setText(planet);
    }
}