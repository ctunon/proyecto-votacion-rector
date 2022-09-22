package com.example.proyecto_votacion_rector;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.example.proyecto_votacion_rector.db.DBHelper;
import com.example.proyecto_votacion_rector.db.DBVoto;
import com.example.proyecto_votacion_rector.entidades.Datos;

import java.util.Iterator;

public class MainActivity extends AppCompatActivity {

    Button btnIngresar;
    EditText etxCedula;

    Datos votante;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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

                DBVoto dbVoto = new DBVoto(MainActivity.this);
                votante = dbVoto.Verificar(cedula);

                if(votante != null){

                    if(votante.getVoto() == null){
                        Intent intent =  new Intent(getApplicationContext(), Votacion.class);
                        intent.putExtra("id", votante.getId());
                        startActivity(intent);
                    }

                    else{
                        Intent intent =  new Intent(getApplicationContext(), Resultados.class);
                        startActivity(intent);
                    }
                }

                else{
                    Toast.makeText(MainActivity.this, "ESTA CEDULA NO EXISTE", Toast.LENGTH_LONG).show();
                }


            }
        });


    }


}
