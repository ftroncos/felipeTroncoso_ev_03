package com.example.main_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

import Clases.Plibros;

public class Github_Act extends AppCompatActivity {

    private Spinner spin;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_github_);

        spin = (Spinner)findViewById(R.id.sp);
        text = (TextView)findViewById(R.id.et);

        ArrayList<String> listaLibros = (ArrayList<String>) getIntent().getSerializableExtra("listaLibros");
        ArrayAdapter<String> adapt = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listaLibros);

        spin.setAdapter(adapt);
        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Plibros plibros = new Plibros();

                String libro = spin.getSelectedItem().toString();
                int Pfarenheith = Integer.parseInt(plibros.getFarenheith());
                int Previval = Integer.parseInt(plibros.getRevival());
                int Palquimista = Integer.parseInt(plibros.getAlquimista());
                int Ppoder = Integer.parseInt(plibros.getPoder());
                int Pdespertar = Integer.parseInt(plibros.getDespertar());

                if(libro.equals("Farenheith"))
                {
                    text.setText("El valor de Farenheith es: " + Pfarenheith);
                }
                if(libro.equals("Revival"))
                {
                    text.setText("El valor de Revival es: " + Previval);
                }
                if(libro.equals("El Alquimista"))
                {
                    text.setText("El valor de El Alquimista es: " + Palquimista);
                }
                if(libro.equals("El Poder"))
                {
                    text.setText("El valor de El Poder es: " + Ppoder);
                }
                if(libro.equals("Despertar"))
                {
                    text.setText("El precio de Despertar es: " + Pdespertar);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });




    }
}