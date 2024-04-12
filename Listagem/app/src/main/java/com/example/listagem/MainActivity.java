package com.example.listagem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] nomes = new String[]{"Amanda", "Lara", "Duda", "Gabi", "Gaby", "Vitória"};
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.listView);
        //Configurando um adaptador para listagem de dados
        ArrayAdapter<String> adapter = new ArrayAdapter(
                this,
                R.layout.item_lista,
                R.id.textViewNome,
                nomes
        );
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(), ExibeActivity.class);
                intent.putExtra("posicao", i);
                startActivity(intent);
            }
        });
    }
}