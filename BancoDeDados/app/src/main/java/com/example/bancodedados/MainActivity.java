package com.example.bancodedados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    SQLiteDatabase db;
    EditText ed;
    ListView listView;
    Button btnSalvar;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed=findViewById(R.id.editText);
        listView=findViewById(R.id.listView);
        btnSalvar=findViewById(R.id.btnSalvar);
        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = ed.getText().toString();
                inserirNotas(s);
                carregarListaNotas();
            }
        });
        configDatabase();
    }

    @Override
    protected void onStart() {
        super.onStart();
        carregarListaNotas();
    }

    private void configDatabase() {
        db.openOrCreateDatabase("notas", MODE_PRIVATE, null);

    }

    private void carregarListaNotas() {
    }

    private void inserirNotas(String s) {
    }
}