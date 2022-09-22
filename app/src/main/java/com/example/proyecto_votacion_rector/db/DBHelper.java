package com.example.proyecto_votacion_rector.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper{

    private static final int DATABASE_VERSION = 1;

    private static final String DATABASE_NOMBRE = "candidatura.db";
    public static final String TABLE_VOTOS = "t_votos";


    public DBHelper(@Nullable Context context) {
        super(context, DATABASE_NOMBRE, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL("CREATE TABLE " + TABLE_VOTOS + "("+
                "id INTEGER PRIMARY KEY AUTOINCREMENT,"+
                "cedula TEXT NOT NULL," +
                "voto INT NOT NULL)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE "+ TABLE_VOTOS);
        onCreate(sqLiteDatabase);

    }
}
