package com.example.proyecto_votacion_rector;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import java.util.ArrayList;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.EditText;
import java.util.ArrayList;

public class Votacion extends AppCompatActivity {

    RadioButton rb1, rb2, rb3;
    Button btnVotar, btnRegresar;

    public ArrayList<Datos> votantes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_votacion);

        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);
        rb3 = findViewById(R.id.rb3);
        btnVotar = findViewById(R.id.btnVotar);

        rb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rb2.setChecked(false);
                rb3.setChecked(false);
            }
        });

        rb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rb1.setChecked(false);
                rb3.setChecked(false);

            }
        });

        rb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rb1.setChecked(false);
                rb2.setChecked(false);
            }
        });


        btnVotar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = getIntent();

                String cedula = intent.getStringExtra("cedula");

                votantes = new ArrayList<Datos>();

                if(rb1.isChecked()){
                    votantes.add(new Datos(cedula, 1));
                    Intent res = new Intent(getApplicationContext(), Resultados.class);
                    startActivity(res);

                }

                else if(rb2.isChecked()){
                    votantes.add(new Datos(cedula, 2));
                    Intent res = new Intent(getApplicationContext(), Resultados.class);
                    startActivity(res);

                }

                else if(rb3.isChecked()){
                    votantes.add(new Datos(cedula, 3));
                    Intent res = new Intent(getApplicationContext(), Resultados.class);
                    startActivity(res);
                }

                else {
                    votantes.add(new Datos(cedula, null));
                }
            }
        });

    }
}