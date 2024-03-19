package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class IMCResultado extends AppCompatActivity {

    TextView txtResultado;
    ImageView imageViewResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imcresultado);
        txtResultado=findViewById(R.id.textViewResultado);
        imageViewResultado=findViewById(R.id.imageViewResultado);

        imageViewResultado.setImageResource(R.drawable.abaixopeso);
        Intent i=getIntent();
        Bundle bundle = i.getExtras();
        Log.d("Valor do IMC: ", bundle.getString("valorimc"));

        txtResultado.setText(bundle.getString("valorimc"));
        Double d = bundle.getDouble("valorimc");

        //if()
    }
}