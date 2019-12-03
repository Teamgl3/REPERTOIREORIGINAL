package com.example.projetandroid;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BddManip extends SQLiteOpenHelper {






    private static final String TABLE_CONTACT = "table_doffou";
    private static final String COL_ID = "ID";
    private static final String COL_NOM= "NOM";
    private static final String COL_Numero = "NUMERO";



    private static final String CREATE_BDD = "CREATE TABLE " + TABLE_CONTACT + " ("
            + COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COL_NOM + " TEXT NOT NULL, "
            + COL_Numero + " TEXT NOT NULL );";

    public BddManip(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {


        super(context, name, factory, version) ;






    }



    @Override
    public void onCreate(SQLiteDatabase  db) {
        db.execSQL(CREATE_BDD);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE " + TABLE_CONTACT + ";");
        onCreate(db);

    }
}
