package com.example.optiondemo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class OptionDemo extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_option_demo);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.option, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch (item.getItemId()) {
		case R.id.menu1: 
			Toast.makeText(OptionDemo.this, "Menu1", 123).show();
	        return true;
	        
		case R.id.menu2: 
			Toast.makeText(OptionDemo.this, "Menu2", 123).show();
	        return true;
	        
		case R.id.menu3: 
			Toast.makeText(OptionDemo.this, "Menu3", 123).show();
	        return true;
		}
		return true;
	}
}
