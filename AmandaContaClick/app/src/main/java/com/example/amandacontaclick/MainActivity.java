package com.example.amandacontaclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int i=0;

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.tvContador);
    }

    protected void onStart(){
        super.onStart();
        textView.setText("0");
    }

    public void contar (View v){
        i++;
        TextView tv = (TextView) v;
        tv.setText("Você clicou " +  Integer.toString(i) + " vezes!");
    }
}