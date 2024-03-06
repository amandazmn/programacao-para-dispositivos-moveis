package com.example.contaclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

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
        //tv.setText("Olá Mundo!");
        tv.setText(Integer.toString(i));
    }
}