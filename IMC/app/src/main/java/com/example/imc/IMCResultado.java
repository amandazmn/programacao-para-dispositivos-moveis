package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class IMCResultado extends AppCompatActivity {

    TextView txtResultado;
    TextView txtAltura;
    TextView txtPeso;
    TextView txtImc;
    ImageView imageViewResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imcresultado);
        txtResultado=findViewById(R.id.textViewResultado);
        imageViewResultado=findViewById(R.id.imageViewResultado);
        txtAltura=findViewById(R.id.tvAltura);
        txtPeso=findViewById(R.id.tvPeso);
        txtImc=findViewById(R.id.tvImcTexto);

        imageViewResultado.setImageResource(R.drawable.abaixopeso);
        Intent i=getIntent();
        Bundle bundle = i.getExtras();
        Log.d("Valor do IMC: ", bundle.getString("imc"));

        txtResultado.setText("IMC: " + bundle.getString("imc"));
        Double imc = bundle.getDouble("valorimc");

        txtAltura.setText("Altura: " + bundle.getString("altura"));
        txtPeso.setText("Peso: " + bundle.getString("peso"));

        if(imc < 18.5){
            txtImc.setText("Abaixo do peso");
            imageViewResultado.setImageResource(R.drawable.abaixopeso);
        } else if((imc >= 18.5) && (imc <= 24.9)){
            txtImc.setText("Normal");
            imageViewResultado.setImageResource(R.drawable.normal);
        } else if((imc >= 25) && (imc <= 29.9)){
            txtImc.setText("Sobrepeso");
            imageViewResultado.setImageResource(R.drawable.sobrepeso);
        } else if((imc >= 30) && (imc <= 34.9)){
            txtImc.setText("Obesidade 1");
            imageViewResultado.setImageResource(R.drawable.obesidade1);
        } else if((imc >= 35) && (imc <= 39.9)){
            txtImc.setText("Obesidade 2");
            imageViewResultado.setImageResource(R.drawable.obesidade2);
        } else if(imc >= 40){
            txtImc.setText("Obesidade 3");
            imageViewResultado.setImageResource(R.drawable.obesidade3);
        }
    }
}