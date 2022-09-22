package com.example.proyecto_votacion_rector.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.Nullable;

public class DBVoto extends DBHelper {

    Context context;

    public DBVoto(@Nullable Context context) {
        super(context);
        this.context = context;
    }

    public boolean Votar(int id, String cedula, int voto) {

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

}
