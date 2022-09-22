package com.example.proyecto_votacion_rector;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import java.util.ArrayList;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.proyecto_votacion_rector.db.DBVoto;
import com.example.proyecto_votacion_rector.entidades.Datos;

public class Votacion extends AppCompatActivity {

    RadioButton rb1, rb2, rb3;
    Button btnVotar, btnRegresar;
    boolean correcto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_votacion);

        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);
        rb3 = findViewById(R.id.rb3);
        btnVotar = findViewById(R.id.btnVotar);
        btnRegresar = findViewById(R.id.btnRegresar);

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
                int id = intent.getIntExtra("id", 0);

                DBVoto dbVoto = new DBVoto(Votacion.this);

                if(rb1.isChecked()){

                    correcto=dbVoto.Votar(id, 1);
                    if(correcto){
                        Toast.makeText(Votacion.this, "REGISTRO MODIFICADO", Toast.LENGTH_LONG).show();
                        Intent res = new Intent(getApplicationContext(), Resultados.class);
                        startActivity(res);
                    } else {
                        Toast.makeText(Votacion.this, "ERROR AL MODIFICAR REGISTRO", Toast.LENGTH_LONG).show();
                    }


                }

                else if(rb2.isChecked()){

                    dbVoto.Votar(id, 2);
                    if(correcto){
                        Toast.makeText(Votacion.this, "REGISTRO MODIFICADO", Toast.LENGTH_LONG).show();
                        Intent res = new Intent(getApplicationContext(), Resultados.class);
                        startActivity(res);
                    } else {
                        Toast.makeText(Votacion.this, "ERROR AL MODIFICAR REGISTRO", Toast.LENGTH_LONG).show();
                    }

                }

                else if(rb3.isChecked()){

                    dbVoto.Votar(id, 3);
                    if(correcto){
                        Toast.makeText(Votacion.this, "REGISTRO MODIFICADO", Toast.LENGTH_LONG).show();
                        Intent res = new Intent(getApplicationContext(), Resultados.class);
                        startActivity(res);
                    } else {
                        Toast.makeText(Votacion.this, "ERROR AL MODIFICAR REGISTRO", Toast.LENGTH_LONG).show();
                    }
                }

            }
        });

        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

    }
}