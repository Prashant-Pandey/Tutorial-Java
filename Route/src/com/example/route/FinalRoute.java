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

public class FinalRoute extends Activity {
	ListView lt1;
	String s[]={"Jaipur","Phulera","Kishangarh","Ajmer","Nasirabad","Bijainagar","Gulabpura","Ralia","Mandal","Bhilwara","Chittorgarh","Kapasan","Mavali","Udaipur"};	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_final_route);
		lt1=(ListView)findViewById(R.id.listView1);
		ArrayAdapter<String>ar=new ArrayAdapter<String>(FinalRoute.this, android.R.layout.select_dialog_item ,s);
		lt1.setAdapter(ar);
		lt1.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
				
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_final_route, menu);
		return true;
	}

}
