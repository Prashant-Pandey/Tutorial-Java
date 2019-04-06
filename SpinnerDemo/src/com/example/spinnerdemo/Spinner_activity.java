package com.example.spinnerdemo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class Spinner_activity extends Activity {
	Spinner sp;
	String[] s={"select_city","ajmer","alwar","jaipur","agra"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_spinner_activity);
		sp=(Spinner)findViewById(R.id.spinner1);
		ArrayAdapter<String>ar=new ArrayAdapter<String>(Spinner_activity.this,android.R.layout.simple_dropdown_item_1line,s);
		sp.setAdapter(ar);
		sp.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
				Toast.makeText(Spinner_activity.this,""+arg2,11).show();
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
		getMenuInflater().inflate(R.menu.activity_spinner_activity, menu);
		return true;
	}

}
