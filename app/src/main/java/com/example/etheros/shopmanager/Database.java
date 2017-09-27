package com.example.etheros.shopmanager;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


class Database extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "database_v";
    private static final int DATABASE_VERSION = 1;

    private static final String DATABASE_TABLE_HAIR_CARE = "Hair Care";
    private static final String DATABASE_TABLE_HAIR_DYE = "Hair dye";
    private static final String DATABASE_TABLE_SHAMPOO = "Shampoo";

    private static final String DATABASE_TABLE_FACE_CARE = "Face Care";

    private static final String DATABASE_TABLE_BODY_CARE = "Body Care";

    private static final String DATABASE_TABLE_FOOT_CARE = "Foot Care";

    private static final String DATABASE_TABLE_PERFUME = "Perfume";

    private static final String DATABASE_TABLE_ACCESSORIES = "Accessories";

    Database(Context context) {
        super(context, DATABASE_NAME + DATABASE_VERSION, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("Create Table " + DATABASE_TABLE_HAIR_CARE + " ( _ID Integer Primary Key Autoincrement, Category Text");
        sqLiteDatabase.execSQL("Create Table " + DATABASE_TABLE_HAIR_DYE  + " ( _ID Integer Primary Key Autoincrement, Name Text, Amount Integer, Volume Integer, Color Text, Storage Text, Producer Text ");
        sqLiteDatabase.execSQL("Create Table " + DATABASE_TABLE_SHAMPOO  + " ( _ID Integer Primary Key Autoincrement, Name Text, Amount Integer, Volume Integer, Storage Text, Producer Text ");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
