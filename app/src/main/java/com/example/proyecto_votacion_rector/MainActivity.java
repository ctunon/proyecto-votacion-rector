package com.example.proyecto_votacion_rector;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import java.util.ArrayList;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.EditText;
import android.widget.Toast;

import com.example.proyecto_votacion_rector.db.DBHelper;

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
        DBHelper dbHelper = new DBHelper(MainActivity.this);
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        if(db!=null){
            Toast.makeText(MainActivity.this, "BASE DE DATOS CREADA", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(MainActivity.this, "ERROR", Toast.LENGTH_SHORT).show();
        }




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