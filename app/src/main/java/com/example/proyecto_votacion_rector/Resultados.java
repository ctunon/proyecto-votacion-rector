package com.example.proyecto_votacion_rector;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.proyecto_votacion_rector.db.DBVoto;
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

        tvVivian = findViewById(R.id.tvVivian);
        tvMartin = findViewById(R.id.tvMartin);
        tvOmar = findViewById(R.id.tvOmar);
        btnSalir =  findViewById(R.id.btnSalir);

        pbVivian = findViewById(R.id.pbVivian);
        pbOmar = findViewById(R.id.pbOmar);
        pbMartin = findViewById(R.id.pbMartin);

        DBVoto dbVoto = new DBVoto(Resultados.this);


        int votosVivian = dbVoto.Valenzuela();
        int votosOmar = dbVoto.Aizpurua();
        int votosMartin = dbVoto.Candanedo();
        int votosTotales = votosMartin+votosVivian+votosOmar;


        double porcentajeVivian= ((double) votosVivian / votosTotales) * 100;
        tvVivian.setText(String.format(Locale.getDefault(), "%.0f%%", porcentajeVivian));
        pbVivian.setProgress((int) porcentajeVivian);

        double porcentajeOmar= ((double) votosOmar / votosTotales) * 100;
        tvOmar.setText(String.format(Locale.getDefault(), "%.0f%%", porcentajeOmar));
        pbOmar.setProgress((int) porcentajeOmar);

        double porcentajeMartin= ((double) votosMartin / votosTotales) * 100;
        tvMartin.setText(String.format(Locale.getDefault(), "%.0f%%", porcentajeMartin));
        pbMartin.setProgress((int) porcentajeMartin);

        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);

            }
        });







    }
}



