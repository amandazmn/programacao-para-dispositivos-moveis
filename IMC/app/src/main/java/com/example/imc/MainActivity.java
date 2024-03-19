package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private EditText txtPeso, txtAltura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtPeso=findViewById(R.id.txtPeso);
        txtAltura=findViewById(R.id.txtAltura);
    }

    public void calcular(View view){
        double altura = Double.parseDouble(txtAltura.getText().toString());
        double peso = Double.parseDouble(txtPeso.getText().toString());

        double imcD = peso/(altura * altura);

        DecimalFormat df = new DecimalFormat("##.##");

        String imc = df.format(imcD);

        Toast.makeText(this, imc, Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(getApplicationContext(), IMCResultado.class);
        intent.putExtra("valorimc", imc);
        startActivity(intent);
    }
}