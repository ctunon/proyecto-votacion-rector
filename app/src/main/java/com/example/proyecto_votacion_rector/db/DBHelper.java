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

        sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS " + TABLE_VOTOS + "("+
                "id INTEGER PRIMARY KEY AUTOINCREMENT,"+
                "cedula TEXT NOT NULL," +
                "voto INT )");

        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('8-944-327', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('3-740-1394', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('20-53-4282', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('8-943-1867', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('8-937-503', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('8-952-2444', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('8-943-12', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('8-986-549', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('8-957-1827', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('8-940-1311', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('8-863-1620', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('8-964-691', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('8-954-1126', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('8-1039-1537', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('8-925-1168', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('8-940-1505', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('8-938-925', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('3-743-2493', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('E-8-169755', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('8-971-1811', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('8-940-408', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('8-937-1640', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('8-939-1578', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('8-942-1406', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('6-722-724', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('8-941-1215', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('8-962-1218', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('8-941-924', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('8-980-2414', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('3-742-2055', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('8-942-1192', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('8-904-1189', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('8-959-857', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('8-964-1554', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('8-1066-1018', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('8-1055-701', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('8-970-242', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('3-752-1461', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('3-745-950', null)");


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+ TABLE_VOTOS);
        onCreate(sqLiteDatabase);

    }
}


