package com.example.listagemplanetas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class AdapterPlanets extends ArrayAdapter<Planet> {
    Object[] mObjects;
    public AdapterPlanets(Context context, int resource, Planet[] objects){
        super(context, resource, objects);
        mObjects = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemLista = LayoutInflater.from(getContext()).inflate(R.layout.item_lista_planeta, parent, false);
        TextView tvNome = itemLista.findViewById(R.id.textViewNomePlaneta);
        ImageView ivPlanet = itemLista.findViewById(R.id.imageView2);
        Planet planet = (Planet) mObjects[position];

        tvNome.setText(planet.nome);
        ivPlanet.setImageResource(planet.img);

        return itemLista;
    }
}
