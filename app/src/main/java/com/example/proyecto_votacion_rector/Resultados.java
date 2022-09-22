package com.example.proyecto_votacion_rector;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class Resultados extends AppCompatActivity {

    Votantes appState = ((Votantes) getApplicationContext());
    ArrayList<Datos> votantes = appState.votantes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);
        System.out.println("FUNCIONO?"+ votantes.get(38));
    }
}