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

    Votantes anotherClass = new Votantes();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_votacion);

        ArrayList<Datos> votantes = anotherClass.getList();

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

                Integer cedulaIndex = intent.getIntExtra("cedulaIndex", 0);


                if(rb1.isChecked()){

                    votantes.get(cedulaIndex).setVoto(1);
                    System.out.println("FUNCIONO?"+ votantes.get(0).getVoto() + " "+votantes.get(0).getCedula());
                    Intent res = new Intent(getApplicationContext(), Resultados.class);
                    startActivity(res);


                }

                else if(rb2.isChecked()){

                    votantes.get(cedulaIndex).setVoto(2);
                    Intent res = new Intent(getApplicationContext(), Resultados.class);
                    startActivity(res);

                }

                else if(rb3.isChecked()){

                    votantes.get(cedulaIndex).setVoto(3);
                    Intent res = new Intent(getApplicationContext(), Resultados.class);
                    startActivity(res);
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