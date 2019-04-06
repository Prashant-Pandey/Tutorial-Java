package com.example.optiondemo;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Region.Op;
import android.view.Menu;
import android.widget.Button;

public class Connection extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_connection);
		Button b= (Button)findViewById(R.id.button1);
		Intent i=new Intent(Connection.this, OptionDemo.class);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_connection, menu);
		return true;
	}

}
