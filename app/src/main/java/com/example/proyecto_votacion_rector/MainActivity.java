package com.example.proyecto_votacion_rector;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import java.util.ArrayList;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnIngresar;
    EditText etxCedula;

    Votantes appState = ((Votantes) getApplicationContext());
    ArrayList<Datos> votantes = appState.votantes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIngresar = findViewById(R.id.btnIngresar);
        etxCedula = findViewById(R.id.etxCedula);

        votantes.add(new Datos("08-0944-000327", null));
        votantes.add(new Datos("03-0740-001394", null));
        votantes.add(new Datos("20-0053-004282", null));
        votantes.add(new Datos("08-0943-001867", null));
        votantes.add(new Datos("08-0937-000503", null));
        votantes.add(new Datos("08-0952-002444", null));
        votantes.add(new Datos("08-0943-000012", null));
        votantes.add(new Datos("08-0986-000549", null));
        votantes.add(new Datos("08-0957-001827", null));
        votantes.add(new Datos("08-0940-001311", null));
        votantes.add(new Datos("08-0863-001620", null));
        votantes.add(new Datos("08-0964-000691", null));
        votantes.add(new Datos("08-0954-001126", null));
        votantes.add(new Datos("08-1039-001537", null));
        votantes.add(new Datos("08-0925-001168", null));
        votantes.add(new Datos("08-0940-001505", null));
        votantes.add(new Datos("08-0938-000925", null));
        votantes.add(new Datos("03-0743-002493", null));
        votantes.add(new Datos("0E-0008-169755", null));
        votantes.add(new Datos("08-0971-001811", null));
        votantes.add(new Datos("08-0940-000408", null));
        votantes.add(new Datos("08-0937-001640", null));
        votantes.add(new Datos("08-0939-001578", null));
        votantes.add(new Datos("08-0942-001406", null));
        votantes.add(new Datos("06-0722-000724", null));
        votantes.add(new Datos("08-0941-001215", null));
        votantes.add(new Datos("08-0962-001218", null));
        votantes.add(new Datos("08-0941-000924", null));
        votantes.add(new Datos("08-0980-002414", null));
        votantes.add(new Datos("03-0742-002055", null));
        votantes.add(new Datos("08-0942-001192", null));
        votantes.add(new Datos("08-0904-001189", null));
        votantes.add(new Datos("08-0959-000857", null));
        votantes.add(new Datos("08-0964-001554", null));
        votantes.add(new Datos("08-1066-001018", null));
        votantes.add(new Datos("08-1055-000701", null));
        votantes.add(new Datos("08-0970-000242", null));
        votantes.add(new Datos("03-0752-001461", null));
        votantes.add(new Datos("03-0745-000950", null));

        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String cedula = etxCedula.getText().toString();

                for(int i = 0; i<votantes.size(); i++){

                    if(votantes.get(i).getCedula().equals(cedula)){
                        Intent intent =  new Intent(getApplicationContext(), Votacion.class);
                        intent.putExtra("cedula", cedula);
                        startActivity(intent);
                    }
                }

            }
        });



    }




}