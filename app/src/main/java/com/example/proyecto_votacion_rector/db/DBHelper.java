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

        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('08-0944-000327', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('03-0740-001394', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('20-0053-004282', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('08-0943-001867', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('08-0937-000503', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('08-0952-002444', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('08-0943-000012', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('08-0986-000549', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('08-0957-001827', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('08-0940-001311', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('08-0863-001620', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('08-0964-000691', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('08-0954-001126', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('08-1039-001537', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('08-0925-001168', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('08-0940-001505', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('08-0938-000925', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('03-0743-002493', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('0E-0008-169755', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('08-0971-001811', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('08-0940-000408', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('08-0937-001640', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('08-0939-001578', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('08-0942-001406', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('06-0722-000724', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('08-0941-001215', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('08-0962-001218', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('08-0941-000924', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('08-0980-002414', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('03-0742-002055', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('08-0942-001192', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('08-0904-001189', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('08-0959-000857', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('08-0964-001554', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('08-1066-001018', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('08-1055-000701', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('08-0970-000242', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('03-0752-001461', null)");
        sqLiteDatabase.execSQL("INSERT INTO " + TABLE_VOTOS+ "(cedula, voto) VALUES('03-0745-000950', null)");


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+ TABLE_VOTOS);
        onCreate(sqLiteDatabase);

    }
}


