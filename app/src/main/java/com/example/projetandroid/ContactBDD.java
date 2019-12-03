package com.example.projetandroid;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class ContactBDD extends SQLiteOpenHelper {



    public static final String DATABASE_NAME = "MyDBName.db";
    public static final String CONTACTS_TABLE_NAME = "contacts";
    public static final String CONTACTS_COLUMN_ID = "id";
    public static final String CONTACTS_COLUMN_NAME = "name";
    public static final String CONTACTS_COLUMN_PHONE = "phone";
    public static final String CONTACTS_COLUMN_EMAIL = "email";
    public static final String CONTACTS_COLUMN_hashtag = "hashtag";


    public ContactBDD(Context context) {
        super(context, DATABASE_NAME , null, 1);
    }





    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(
                "create table contacts " +
                        "(id integer primary key, name text,phone text,email text,hastag text);"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS contacts");
        onCreate(db);
    }



    public Cursor getData(int id) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "select * from contacts where id="+id+"", null );
        return res;
    }

    public int numberOfRows(){
        SQLiteDatabase db = this.getReadableDatabase();
        int numRows = (int) DatabaseUtils.queryNumEntries(db, CONTACTS_TABLE_NAME);
        return numRows;
    }

    public boolean updateContact (Integer id, String name, String phone, String email, String street,String place) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", name);
        contentValues.put("phone", phone);

        db.update("contacts", contentValues, "id = ? ", new String[] { Integer.toString(id) } );
        return true;
    }


    public boolean insertContact (String name, String phone,String email,String hashtag) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", name);
        contentValues.put("phone", phone);
        contentValues.put("phone", email);
        contentValues.put("phone", hashtag);

        db.insert("contacts", null, contentValues);
        return true;
    }













    public Integer deleteContact (Integer id) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete("contacts",
                "id = ? ",
                new String[] { Integer.toString(id) });
    }




    public ArrayList<Contact> getAllCotacts() {
        ArrayList<Contact> array_list = new ArrayList<Contact>();

        //hp = new HashMap();

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "select * from contacts", null );
        res.moveToFirst();

        while(res.isAfterLast() == false){

            Contact contact=new Contact(res.getString(res.getColumnIndex(CONTACTS_COLUMN_NAME)),res.getString(res.getColumnIndex(CONTACTS_COLUMN_PHONE)),res.getString(res.getColumnIndex(CONTACTS_COLUMN_EMAIL )),res.getString(res.getColumnIndex(CONTACTS_COLUMN_hashtag)));

            array_list.add(contact);
            res.moveToNext();
        }
        return array_list;
    }




}