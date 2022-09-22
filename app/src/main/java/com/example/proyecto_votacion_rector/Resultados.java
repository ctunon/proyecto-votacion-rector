package com.example.proyecto_votacion_rector;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Collections;

public class Resultados extends AppCompatActivity {
    Votantes anotherClass = new Votantes();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ArrayList<Datos> votantes = anotherClass.getList();

        setContentView(R.layout.activity_resultados);

        //int occurences = Collections.frequency(animals, "bat");

        System.out.println("FUNCIONO?"+ votantes.get(0).getVoto() + " "+votantes.get(0).getCedula());
    }
}