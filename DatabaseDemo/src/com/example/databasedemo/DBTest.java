package com.example.databasedemo;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class DBTest extends SQLiteOpenHelper {

	public DBTest(Context context) {
		super(context, "JU", null, 11);
		// TODO Auto-generated constructor stub
	}
	String s="CREATE TABLE student (sno INTEGER PRIMARY KEY ,name text,fname text)";
	@Override
	public void onCreate(SQLiteDatabase arg0) {
		// TODO Auto-generated method stub
		arg0.execSQL(s);
	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		arg0.execSQL("DROP TABLE IF EXISTS student");
	}
	public void insertvalue(String nm,String fnm){
		SQLiteDatabase dt=getWritableDatabase();
		ContentValues cv=new ContentValues();
		cv.put("name", nm);
		cv.put("fname", fnm);
		dt.insert("student", null, cv);
		dt.close();
		
	}
}
