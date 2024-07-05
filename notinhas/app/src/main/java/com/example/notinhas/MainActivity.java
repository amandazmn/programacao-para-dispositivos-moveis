package com.example.notinhas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    SQLiteDatabase db;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db = openOrCreateDatabase("minhasnotinhas", MODE_PRIVATE, null);
        db.execSQL("CREATE TABLE IF NOT EXISTS notas (id INTEGER PRIMARY KEY AUTOINCREMENT, txt VARCHAR)");
        ContentValues cv = new ContentValues();

        editText.findViewById(R.id.editText);
        findViewById(R.id.bntsalvar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String texto = editText.getText().toString();
                cv.put("txt", texto);
                db.insert("notas", null, cv);
            }
        });
    }

    public void listarNotas(){
        Cursor cursor = db.rawQuery("SELECT * FROM notas", null);
        cursor.moveToFirst();
    }

}