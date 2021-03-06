package com.example.route;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class List extends Activity {
	
	ListView lt;
	String s[]={"Jaipur","Phulera","Kishangarh","Ajmer","Nasirabad","Bijainagar","Gulabpura","Ralia","Mandal","Bhilwara","Chittorgarh","Kapasan","Mavali","Udaipur"};		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list);
		lt=(ListView)findViewById(R.id.listView1);
		ArrayAdapter<String>ar=new ArrayAdapter<String>(List.this, android.R.layout.select_dialog_item ,s);
		lt.setAdapter(ar);
		lt.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,long arg3) {
				// TODO Auto-generated method stub
				String s=(String)arg0.getItemAtPosition(arg2);
				Toast.makeText(List.this, ""+s, 111).show();
				Intent i1=new Intent(List.this,Route.class);
				i1.putExtra("k", s);
				startActivity(i1);
			}
		});	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_list, menu);
		return true;
	}

}
