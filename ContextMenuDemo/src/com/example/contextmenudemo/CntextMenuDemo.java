package com.example.contextmenudemo;

import android.os.Bundle;
import android.app.Activity;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CntextMenuDemo extends Activity {

	Button b;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cntext_menu_demo);
		b=(Button)findViewById(R.id.button1);
		registerForContextMenu(b);
		
	}

	@Override
	public boolean onContextItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		if(item.getTitle()=="Privacy"){
			Toast.makeText(CntextMenuDemo.this, "Privacy Selected", 111).show();
		}
		if(item.getTitle()=="Help"){
			Toast.makeText(CntextMenuDemo.this, "Help Selected", 111).show();
		}
		if(item.getTitle()=="Setting"){
			Toast.makeText(CntextMenuDemo.this, "Setting Selected", 111).show();
		}
		return super.onContextItemSelected(item);
	}
	
	@Override
	public void onCreateContextMenu(ContextMenu menu, View v,ContextMenuInfo menuInfo) {
		// TODO Auto-generated method stub
		super.onCreateContextMenu(menu, v, menuInfo);
		menu.add("Priavcy");
		menu.add("Help");
		menu.add("Setting");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_cntext_menu_demo, menu);
		return true;
	}

}
