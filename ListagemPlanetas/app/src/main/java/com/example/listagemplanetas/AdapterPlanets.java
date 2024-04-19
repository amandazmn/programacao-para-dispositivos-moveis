package com.example.listagemplanetas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class AdapterPlanets extends ArrayAdapter<> {
    public AdapterPlanets(Context context, int resource, Object[] objects){
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return super.getView(position, convertView, parent);
        View view = LayoutInflater.from(getContext()).inflate(R.layout.item_lista_planeta, null);
        TextView tv = itemlista.findViewById(R.id.textViewNomePlaneta);
        Planet
    }
}
