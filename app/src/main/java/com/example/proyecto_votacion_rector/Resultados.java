package com.example.proyecto_votacion_rector;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.proyecto_votacion_rector.entidades.Datos;

import java.util.ArrayList;
import java.util.Locale;

public class Resultados extends AppCompatActivity {

    Button btnRegresar;
    TextView tvVivian, tvMartin, tvOmar;
    Button btnSalir;
    ProgressBar pbVivian, pbOmar, pbMartin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);

        btnRegresar =  findViewById(R.id.btnRegresar);

        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });

        tvVivian = findViewById(R.id.tvVivian);
        tvMartin = findViewById(R.id.tvMartin);
        tvOmar = findViewById(R.id.tvOmar);
        btnSalir= findViewById(R.id.btnRegresar);

        Integer votosVivian =4;
        Integer votosMartin =2;

        tvVivian.setText(String.format(Locale.getDefault(), "%.0f%%", porcentajeVivian));

        double porcentajeOmar= ((double) votosOmar / votosTotales) * 100;
        tvVivian.setText(String.format(Locale.getDefault(), "%.0f%%", porcentajeOmar));
        pbOmar.setProgress((int) porcentajeVivian);

        double porcentajeMartin= ((double) votosMartin / votosTotales) * 100;
        tvVivian.setText(String.format(Locale.getDefault(), "%.0f%%", porcentajeMartin));
        pbVivian.setProgress((int) porcentajeVivian);



    }
}



