package com.example.proyecto_votacion_rector;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.proyecto_votacion_rector.entidades.Datos;

import java.util.ArrayList;
import java.util.Locale;

public class Resultados extends AppCompatActivity {

    TextView tvVivian, tvMartin, tvOmar;
    Button btnSalir;
    ProgressBar pbVivian, pbOmar, pbMartin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);

        tvVivian = findViewById(R.id.tvVivian);
        tvMartin = findViewById(R.id.tvMartin);
        tvOmar = findViewById(R.id.tvOmar);
        btnSalir= findViewById(R.id.btnRegresar);

        Integer votosTotales= 10;
        Integer votosVivian =4;
        Integer votosOmar =4;
        Integer votosMartin =2;


        double porcentajeVivian= ((double) votosVivian / votosTotales) * 100;
        tvVivian.setText(String.format(Locale.getDefault(), "%.0f%%", porcentajeVivian));
        pbVivian.setProgress((int) porcentajeVivian);

        double porcentajeOmar= ((double) votosOmar / votosTotales) * 100;
        tvVivian.setText(String.format(Locale.getDefault(), "%.0f%%", porcentajeOmar));
        pbOmar.setProgress((int) porcentajeVivian);

        double porcentajeMartin= ((double) votosMartin / votosTotales) * 100;
        tvVivian.setText(String.format(Locale.getDefault(), "%.0f%%", porcentajeMartin));
        pbVivian.setProgress((int) porcentajeVivian);



    }


}