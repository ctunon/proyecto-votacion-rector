package com.example.proyecto_votacion_rector;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import java.util.ArrayList;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.EditText;
import java.util.Iterator;

public class MainActivity extends AppCompatActivity {

    Button btnIngresar;
    EditText etxCedula;

    Votantes anotherClass = new Votantes();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Datos> votantes = anotherClass.getList();

        btnIngresar = findViewById(R.id.btnIngresar);
        etxCedula = findViewById(R.id.etxCedula);


        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String cedula = etxCedula.getText().toString();

                for(int i = 0; i<votantes.size(); i++){

                    if(votantes.get(i).getCedula().equals(cedula)){


                        Intent intent =  new Intent(getApplicationContext(), Votacion.class);
                        intent.putExtra("cedulaIndex", i);
                        startActivity(intent);
                    }
                }

            }
        });



    }




}