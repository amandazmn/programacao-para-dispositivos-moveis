package com.example.listagemplanetas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String [] planets = new String[] {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
    Planet[] planet = new Planet[]{
            new Planet("Mercury", R.drawable.mercury ),
            new Planet("Venus", R.drawable.venus),
            new Planet("Earth", R.drawable.terra),
            new Planet("Mars", R.drawable.mars),
            new Planet("Jupter", R.drawable.jupiter),
            new Planet("Saturn", R.drawable.saturn),
            new Planet("Uranus", R.drawable.uranus),
            new Planet("Neptune", R.drawable.neptune)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lv=findViewById(R.id.listView);
        //* ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, planets);
        AdapterPlanets adapter = new AdapterPlanets(this, R.layout.item_lista_planeta, planet);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                Bundle b = new Bundle();
                b.putString("planet", planets[i]);
                intent.putExtras(b);
                startActivity(intent);
            }
        });
    }
}