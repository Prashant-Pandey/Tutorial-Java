package com.example.contactbookdemo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ContactBookDemo extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_contact_book_demo);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_contact_book_demo, menu);
		return true;
	}

}
