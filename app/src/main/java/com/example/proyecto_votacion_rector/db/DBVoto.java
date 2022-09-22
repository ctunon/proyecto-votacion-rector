package com.example.proyecto_votacion_rector.db;

import android.content.Context;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.Cursor;
import android.speech.tts.TextToSpeech;
import android.text.Editable;

import androidx.annotation.Nullable;

import com.example.proyecto_votacion_rector.entidades.Datos;

public class DBVoto extends DBHelper {

    Context context;

    public DBVoto(@Nullable Context context) {
        super(context);
        this.context = context;
    }

    public boolean Votar(int id, int voto) {

        boolean correcto = false;

        DBHelper dbHelper = new DBHelper(context);
        SQLiteDatabase db = dbHelper.getWritableDatabase();

        try {
            db.execSQL("UPDATE " + TABLE_VOTOS+ " SET voto = '" + voto  + "' WHERE id='" + id + "' ");
            correcto = true;
        } catch (Exception ex) {
            ex.toString();
            correcto = false;
        } finally {
            db.close();
        }

        return correcto;
    }

    public Datos Verificar(String  cedula){

        DBHelper dbHelper = new DBHelper(context);
        SQLiteDatabase db = dbHelper.getWritableDatabase();

        Datos votante = null;
        Cursor cursorVotantes;

        System.out.println(cedula);
        cursorVotantes = db.rawQuery("SELECT * FROM t_votos WHERE cedula = ?"  , new String[] {cedula.trim()});

        System.out.println(cursorVotantes.moveToFirst());

        if (cursorVotantes.moveToFirst()) {
            votante = new Datos();
            votante.setId(cursorVotantes.getInt(0));
            votante.setCedula(cursorVotantes.getString(1));
            votante.setVoto(cursorVotantes.getInt(2));
        }

        cursorVotantes.close();

        return votante;

    }


    /*public int Valenzuela(){

        DBHelper dbHelper = new DBHelper(context);
        SQLiteDatabase db = dbHelper.getWritableDatabase();

        Cursor cursorVotantes;

        cursorVotantes = db.rawQuery("SELECT COUNT(voto) FROM " + TABLE_VOTOS + " WHERE voto = " + 1 + " LIMIT 1", null);

    }*/




}
